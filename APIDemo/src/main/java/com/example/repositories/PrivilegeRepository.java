package com.example.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.domain.Privilege;

public interface PrivilegeRepository extends CrudRepository<Privilege, Long>{
	Privilege findByName(String name);
}
