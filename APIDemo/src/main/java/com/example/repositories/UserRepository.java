package com.example.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {}
