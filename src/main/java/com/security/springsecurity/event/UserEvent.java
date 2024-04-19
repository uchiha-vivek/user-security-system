package com.security.springsecurity.event;

 

import org.springframework.context.ApplicationEvent;

import com.security.springsecurity.entity.User;

public class UserEvent  extends ApplicationEvent {

 private User user;

 private String entryUrl;

public UserEvent(User user, String entryUrl) {
    super(user);
     this.user=user;
     this.entryUrl=entryUrl;   
}

 

}
