package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user")
public class UserEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "col_id", nullable = false, unique = true)
    private long id;
	
	@Column(name = "username", columnDefinition = "NVARCHAR(255)")
	private String username;
	
	@Column(name = "password", columnDefinition = "NVARCHAR(255)")
	private String password;
}
