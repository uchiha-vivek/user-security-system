package com.security.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.springsecurity.entity.User;
import com.security.springsecurity.models.UserModel;
import com.security.springsecurity.repository.UserRepository;

@Service
public class UserServiceimplementation  implements UserService  {

      
   @Autowired
   private UserRepository userRepository;

   @Autowired
   private PasswordEncoder passwordEncoder;
 

    @Override
    public User enterUser(UserModel userModel){
        User user = new User();
        user.setFirstName(userModel.getFirstName());
        user.setLastName(userModel.getLastName());
        user.setFatherName(userModel.getFatherName());
        user.setEmail(userModel.getEmail());
        
        user.setPassword(passwordEncoder.encode(userModel.getPassword())); // ## used for encoding the password ## //
        userRepository.save(user);
        return user;
        
    }

}
