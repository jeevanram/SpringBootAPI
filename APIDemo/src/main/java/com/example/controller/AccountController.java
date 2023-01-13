package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;
import com.example.dto.LoginDTO;
import com.example.dto.UserDTO;
import com.example.services.UserService;

@RestController
@RequestMapping("/api/account")
public class AccountController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(path="/create")
	  public @ResponseBody String addNewUser (@RequestBody UserDTO userDTO) {
	    userService.createAccount(userDTO);
	    return "Success";
	  }
	
	@PostMapping(path="/login")
	  public @ResponseBody boolean addNewUser (@RequestBody LoginDTO loginDTO) {
		User user = userService.getUserByUsername(loginDTO.getUsername());
		if(user == null)
			return false;
	    return userService.verifyPassword(user, loginDTO.getPassword());
	  }
	
	@GetMapping(path="/all")
	  public @ResponseBody Iterable<User> getAllUsers() {
	    return userService.findAll();
	  }
}
