package com.learning.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class R96JdbcExecutor {
	
	private static boolean driverLoaded = false;
	private String user, password;
	
	
	public R96JdbcExecutor(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}

	public void loadJdbcDriver() {
		if(!driverLoaded) {			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				driverLoaded = true;
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	
	public List<Person> getAllPersonRecords() {
		loadJdbcDriver();
		String query = "select * from person";
		List<Person> people = new ArrayList<Person>();
		try(
				Connection sqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/r96", user, password);
				Statement sqlStatement = sqlConnection.createStatement();
				ResultSet sqlResult = sqlStatement.executeQuery(query);
				){
			while(sqlResult.next()) {
				 people.add(new Person(sqlResult.getInt(1), 
						 sqlResult.getString(2),
						 sqlResult.getString(3),
						 sqlResult.getDate(4),
						 sqlResult.getTimestamp(5),
						 sqlResult.getTimestamp(6),
						 sqlResult.getDouble(7),
						 sqlResult.getDouble(8)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return people;
	}
	
	public void insertAllPeople(List<Person> people, boolean autoCommit) {
		loadJdbcDriver();
		String query = "insert into person (first_name, last_name, dob, salary, bonus)"
				+ "values(?, ?, ?, ?, ?)";
		
		try(
				Connection sqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/r96", user, password);				
				PreparedStatement sqlStatement = sqlConnection.prepareStatement(query);
				){
			
			sqlConnection.setAutoCommit(autoCommit);
			
			
			for(Person p : people) {
				sqlStatement.setString(1, p.getFirst_name());
				sqlStatement.setString(2, p.getLast_name());
				sqlStatement.setDate(3, p.getDob());
				sqlStatement.setDouble(4, p.getSalary());
				sqlStatement.setDouble(5, p.getBonus());

				sqlStatement.addBatch();
			}
			
			sqlStatement.executeBatch();
			if(!autoCommit) {
				sqlConnection.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteFromPersons(int from_id, int to_id) {
		loadJdbcDriver();
		
		String query = "delete from Person where id between ? and ?";
		
		try(
				Connection sqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/r96", user, password);
				PreparedStatement sqlStatement = sqlConnection.prepareStatement(query);
				){
			sqlStatement.setInt(1, from_id);
			sqlStatement.setInt(2, to_id);
			sqlStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
