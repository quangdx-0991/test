package com.example.demo.dtos;

import com.example.demo.entities.UserEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
	private String username;
	
	private String password;
	
	public UserEntity createUserEntity() {
		UserEntity user = new UserEntity();
		user.setUsername(this.username);
		user.setPassword(this.password);
		return user;
	}
	
	public UserEntity updateUserEntity(UserEntity user) {
		user.setUsername(this.username);
		user.setPassword(this.password);
		return user;
	}
}
