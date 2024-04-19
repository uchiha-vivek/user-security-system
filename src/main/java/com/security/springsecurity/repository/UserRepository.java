package com.security.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.springsecurity.entity.User;

public interface UserRepository  extends JpaRepository<User,Long> {

 

}
