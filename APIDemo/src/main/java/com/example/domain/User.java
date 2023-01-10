package com.example.domain;

import jakarta.persistence.*;

@Entity
@Table(name="[user]")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	private String name;

	  private String email;

	  public long getId() {
	    return id;
	  }

	  public void setId(Integer id) {
	    this.id = id;
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
