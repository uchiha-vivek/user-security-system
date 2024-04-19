package com.security.springsecurity.service;

import com.security.springsecurity.entity.User;
import com.security.springsecurity.models.UserModel;

public interface UserService {

     User enterUser(UserModel userModel);

}
