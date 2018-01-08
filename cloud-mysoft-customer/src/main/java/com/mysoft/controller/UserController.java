package com.mysoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mysoft.client.UserClient;
import com.mysoft.module.User;

@RestController
public class UserController {

	@Autowired
	private UserClient userClient;
	
	@GetMapping("feign/{id}")
	public User findByIdFeign(@PathVariable Long id) {
		User user = this.userClient.findById(id);
		return user;
	}
	
}
