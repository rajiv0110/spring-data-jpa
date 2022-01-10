package com.rajiv.spring.data.jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajiv.spring.data.jpa.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
