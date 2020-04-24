package com.clinic.support.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinic.support.entity.User;
import com.clinic.support.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/insert")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@GetMapping("/get")
	public List<User> getUser() {
		return userService.getUser();
	}
	
	@DeleteMapping("/delete/{id}")
	public void addUser(@PathVariable("id") Integer id) {
		userService.deleteUser(id);
	}
	
}
