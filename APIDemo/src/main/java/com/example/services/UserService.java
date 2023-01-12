package com.example.services;

import java.util.List;

import com.example.domain.User;
import com.example.dto.UserDTO;

public interface UserService {
	
	public User createAccount(UserDTO userDto);
	public void changePassword(User user, String password);
	public boolean verifyPassword(User user, String password);
	public User getUserByUsername(String username);
	
	public void save(User user);
	public List<User> findAll();
	public void delete(User user);
}
