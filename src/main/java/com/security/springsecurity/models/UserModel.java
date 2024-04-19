package com.security.springsecurity.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserModel {

   
    private String firstName;

    private String lastName;

    private String fatherName;

    private String registrationNumber;


    private String email;

    private String password;

    private String verify_password;



}
