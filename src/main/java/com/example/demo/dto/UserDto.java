package com.example.demo.dto;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
@Data
public class UserDto {
	@NotNull(message="email cannot be null")
	@Email
	private String email;
	@NotNull(message="password cannot be null")
	@Size(min = 8, message="password should be atleast 8 characters")
	private String password;

	
	
	
		
	
}
