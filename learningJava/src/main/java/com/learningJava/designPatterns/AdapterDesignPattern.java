package com.learningJava.designPatterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdapterDesignPattern implements MediaPlayer{

	public static final Logger log = LoggerFactory.getLogger(AdapterDesignPattern.class);
	
	private Mp4Player mp4Player = new Mp4Player();
	private VlcPlayer vlcPlayer = new VlcPlayer();
	
	@Override
	public String play(String fileType, String fileName) {
		switch(fileType.toLowerCase()) {
		case "mp4": return mp4Player.playMp4(fileName);
		case "vlc": return vlcPlayer.playVlc(fileName);
		default: return ("File type " + fileType + " not supported.");
		}
	}
}

interface MediaPlayer{
	public String play(String fileType, String fileName);
}

class Mp4Player{
	public static final Logger log = LoggerFactory.getLogger(Mp4Player.class);
	String playMp4(String fileName) {
		return ("Playing Mp4 file: " + fileName);
	}
}

class VlcPlayer{
	public static final Logger log = LoggerFactory.getLogger(VlcPlayer.class);
	String playVlc(String fileName) {
		return ("Playing Vlc file: " + fileName);
	}
}