package com.security.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.springsecurity.entity.User;
import com.security.springsecurity.event.UserEvent;
import com.security.springsecurity.models.UserModel;
import com.security.springsecurity.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
private UserService userService; // ## Userservice is an interface which has various methods in it. ## //

@Autowired
private ApplicationEventPublisher eventPublisher;

@PostMapping("/entry")
public String enterUser(@RequestBody UserModel userModel ){
    User user =  userService.enterUser(userModel);
    eventPublisher.publishEvent(new UserEvent(user,"url" ));
    System.out.println(user);
    return "user successfully entered"; 
}

}
