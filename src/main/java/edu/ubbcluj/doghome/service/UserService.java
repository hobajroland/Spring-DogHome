package edu.ubbcluj.doghome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ubbcluj.doghome.model.DogHomeUser;
import edu.ubbcluj.doghome.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<DogHomeUser> getAllUsers() {
		return userRepository.findAll();
	}
}
