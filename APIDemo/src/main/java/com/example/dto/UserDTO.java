package com.example.dto;

import com.example.validation.IsSamePassword;
import com.example.validation.ValidPassword;

import jakarta.validation.constraints.NotNull;



@IsSamePassword
public class UserDTO {
	@NotNull
	private String firstName;
	
	@NotNull
	private String lastName;
	
	@NotNull
	private String username;
	
	@NotNull
	private String email;
	
	@ValidPassword
    private String password;

    @NotNull
    private String confirmPassword;
    
    @NotNull
    private String city;
    
    @NotNull
    private String country;
    
    

	public UserDTO() {
	}

	public String getEmail() {
	  return email;
	}

	public void setEmail(String email) {
	  this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMatchingPassword() {
        return confirmPassword;
    }

    public void setMatchingPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    
    public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
