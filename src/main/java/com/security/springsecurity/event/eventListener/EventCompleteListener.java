package com.security.springsecurity.entity.eventListener;

import org.springframework.context.ApplicationListener;

import com.security.springsecurity.event.UserEvent;

public class EventCompleteListener implements ApplicationListener<UserEvent> {

    @Override
    public void onApplicationEvent(UserEvent event) {
        // TODO Auto-generated method stub
         // create verification token for user with Link and after verifcation send mail to user
    }

}
