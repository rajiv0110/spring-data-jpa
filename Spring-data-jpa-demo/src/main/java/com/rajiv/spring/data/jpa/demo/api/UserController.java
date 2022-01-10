package com.rajiv.spring.data.jpa.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajiv.spring.data.jpa.demo.entity.User;
import com.rajiv.spring.data.jpa.demo.service.UserService;

@RestController
@RequestMapping("/spring-data-jpa")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/user")
	void saveUser(@RequestBody final User user) {
		userService.saveUser(user);
	}
}
