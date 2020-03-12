package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.UserDto;
import com.example.demo.entities.UserEntity;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	public UserEntity create(UserDto dto) {
		return repository.save(dto.createUserEntity());
	}
	
	public UserEntity get(long id) {
		Optional<UserEntity> userOptional = repository.findById(id);
		if (!userOptional.isPresent()) {
			throw new RuntimeException("Không tìm thấy user!");
		}
		return userOptional.get();
	}
	
	public UserEntity update(long id, UserDto dto) {
		UserEntity entity = get(id);
		
		return repository.save(dto.updateUserEntity(entity));
	}
	
	public void delete(long id) {
		UserEntity entity = get(id);
		repository.delete(entity);
	}
}
