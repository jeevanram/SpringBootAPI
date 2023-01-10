package com.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDTO {
	@JsonProperty("name")
	private String name;
	@JsonProperty("email")
	private String email;

	public UserDTO() {
	}
	  
	public String getName() {
	   return name;
	}

	public void setName(String name) {
	   this.name = name;
	}

	public String getEmail() {
	  return email;
	}

	public void setEmail(String email) {
	  this.email = email;
	}
}
