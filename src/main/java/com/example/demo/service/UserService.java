package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.utility.Response;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	Response response;
	
	
	
	public Response getAllUsers(){
	
		return new Response("All data", 200, userRepository.findAll());
		
		
	}
	
	public Response addUser(UserDto userDto) {
		User user = modelMapper.map(userDto, User.class);
		userRepository.save(user);
		System.out.println(user.toString());
			return new Response("New User added successfully", 200, user);
	}
	
	public Response getUserById(int id) {
//		User user = userRepository.findById(id);
		return new Response("found user by given id", 200, userRepository.findById(id));
	
	}
	
	public Response updateUser(int id, UserDto userDto) {
		User user = modelMapper.map(userDto, User.class);
		userRepository.save(user);
		return new Response("updated user successfully", 200, user);
	}
	
	public Response deleteUser(int id) {
		return new Response("user deleted", 200, userRepository.deleteById(id));
	
	}




}
