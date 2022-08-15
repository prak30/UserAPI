package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/users/{id}")
	public Optional<User> getUser(@PathVariable int id) {
		return userService.getUser(id);
	}

	@PostMapping("/users")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);

	}
	@PutMapping("/users/{id}")
	public void updateUser(@RequestBody User user, @PathVariable int id) {
		userService.updateUser(id, user);
	}
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}	

}
