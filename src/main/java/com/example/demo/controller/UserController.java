package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.utility.Response;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	

	@GetMapping("/users")
	public ResponseEntity<Response> getAllUsers() {
		Response response = userService.getAllUsers();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<Response> getUserById(@PathVariable int id) {
		Response response = userService.getUserById(id);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PostMapping("/users")
	public ResponseEntity<Response> addUser(@RequestBody UserDto userDto) {
		Response response = userService.addUser(userDto);
		return new ResponseEntity<>(response, HttpStatus.OK);

	}
	@PutMapping("/users/{id}")
	public ResponseEntity<Response> updateUser(@RequestBody UserDto userDto, @PathVariable int id) {
		Response response = userService.updateUser(id, userDto);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	@DeleteMapping("/users/{id}")
	public ResponseEntity<Response> deleteUser(@PathVariable int id) {
		Response response = userService.deleteUser(id);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}	

}
