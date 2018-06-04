package edu.ubbcluj.doghome.router;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ubbcluj.doghome.DogHomeApplication;
import edu.ubbcluj.doghome.model.DogHomeUser;
import edu.ubbcluj.doghome.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	Logger logger = LoggerFactory.getLogger(DogHomeApplication.class);
	
	@GetMapping
	public List<DogHomeUser> getAllUsers() {
		logger.info("GetAllUser");
		return userService.getAllUsers();
	}
}
