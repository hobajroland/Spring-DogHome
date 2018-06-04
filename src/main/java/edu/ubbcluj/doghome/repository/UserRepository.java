package edu.ubbcluj.doghome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ubbcluj.doghome.model.DogHomeUser;

public interface UserRepository extends JpaRepository<DogHomeUser, String> {
	
	DogHomeUser findByUsername(String username);
}
