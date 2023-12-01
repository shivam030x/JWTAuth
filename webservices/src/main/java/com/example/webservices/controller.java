package com.example.webservices;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@Autowired
	private userdatahandling service;
	@GetMapping("/users")
	public List<com.example.webservices.User> retrieveusers()
	{
		return service.findAll();
	}
	@PostMapping("/posts")
	
	public User createUser(@RequestBody User user)
	{
		User saveuser=service.save(user);
		return saveuser;
	}
	
}
