package com.rajiv.spring.data.jpa.demo.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajiv.spring.data.jpa.demo.entity.User;
import com.rajiv.spring.data.jpa.demo.repository.UserRepository;
import com.rajiv.spring.data.jpa.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	@Transactional
	public void saveUser(User user) {
		userRepo.save(user);
	}

}
