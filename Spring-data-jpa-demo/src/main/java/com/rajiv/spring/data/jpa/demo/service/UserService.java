package com.rajiv.spring.data.jpa.demo.service;

import com.rajiv.spring.data.jpa.demo.entity.User;

public interface UserService {

	/*
	 * @Autowired UserRepository userRepo;
	 */

	void saveUser(User user);
}
