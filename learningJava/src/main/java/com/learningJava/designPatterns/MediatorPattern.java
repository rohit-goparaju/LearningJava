package com.learningJava.designPatterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MediatorPattern {
	
	ChatRoom chatRoom = new ChatRoom();
	
	User user1 = new ChatUser(chatRoom, "user1");
	User user2 = new ChatUser(chatRoom, "user2");
	User user3 = new ChatUser(chatRoom, "user3");
	
	{
		chatRoom.addUser(user1);
		chatRoom.addUser(user2);
		chatRoom.addUser(user3);
	}

}

//mediator interface
interface ChatMediator{
	boolean sendMessage(String message, User user);
	boolean addUser(User user);
}

class ChatRoom implements ChatMediator{
	List<User> users = new ArrayList<>();
	
	@Override
	public boolean sendMessage(String message, User sender) {
		boolean result = true;
		for(User user : users) {
			if(user != sender) {
				if(!user.receive(message))
					result = false;
			}
		}
		return result;
	}
	
	@Override
	public boolean addUser(User user) {
		return users.add(user);
	}
}


abstract class User{
	
	ChatMediator mediator;
	String name;

	
	public User(ChatMediator mediator, String name) {
		super();
		this.mediator = mediator;
		this.name = name;
	}

	abstract boolean send(String message);
	abstract boolean receive(String message);
}

class ChatUser extends User{

	public ChatUser(ChatMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	boolean receive(String message) {
		if(Objects.nonNull(message))
			return true;
		else
			return false;
	}
	
	@Override
	boolean send(String message) {
		if(Objects.nonNull(message))
			return mediator.sendMessage(message, this);
		else
			return false;
	}
}