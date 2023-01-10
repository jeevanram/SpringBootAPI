package com.example.services;

import java.util.List;

import com.example.domain.User;

public interface UserService {
	public void save(User user);
	public List<User> findAll();
	public void delete(User user);
}
