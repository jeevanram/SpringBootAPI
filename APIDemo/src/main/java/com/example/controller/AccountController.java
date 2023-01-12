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
	
	@PostMapping(path="/create") // Map ONLY POST Requests
	  public @ResponseBody String addNewUser (@RequestBody UserDTO userDTO) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request
	    userService.createAccount(userDTO);
	    return "Success";
	  }
	
	@PostMapping(path="/login") // Map ONLY POST Requests
	  public @ResponseBody boolean addNewUser (@RequestBody LoginDTO loginDTO) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request
		User user = userService.getUserByUsername(loginDTO.getUsername());
		if(user == null)
			return false;
	    return userService.verifyPassword(user, loginDTO.getPassword());
	  }
	
	@GetMapping(path="/all")
	  public @ResponseBody Iterable<User> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return userService.findAll();
	  }
}
