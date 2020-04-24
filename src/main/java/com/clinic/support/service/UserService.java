package com.clinic.support.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.support.dao.UserRepository;
import com.clinic.support.entity.User;

@Service
public class UserService {

	
	@Autowired
	private UserRepository userRepository;
	
	
	public void addUser(User user) {
		userRepository.save(user);
	}
	
	public List<User> getUser() {
		return userRepository.findAll();
	}
	
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}
	
}
