package com.example.webservices;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;
@Component
public class userdatahandling {
	public static int usersCount=2;
	private static ArrayList<User> users=new ArrayList<User>();  
	//intial users
	static
	{
		users.add(new User(UUID.randomUUID().toString(), "John"));
		users.add(new User(UUID.randomUUID().toString(), "Robert"));
	}
	public List<User> findAll()
	{
		return users;
	}
	public User save(User user)
	{
		
		users.add(user);
		System.out.println(usersCount);
		return user;
	}
}
