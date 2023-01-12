package com.example.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByName(String name);
}
