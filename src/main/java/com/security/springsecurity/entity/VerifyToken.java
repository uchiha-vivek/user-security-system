package com.security.springsecurity.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class VerifyToken {
  
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String token;

    // ## setting up expire time for token ## // 
    private Date expireTime;

     @OneToOne(fetch = FetchType.EAGER)
     @JoinColumn(name = "user_id", nullable = false , foreignKey = @ForeignKey(name="USER_VERIFY_TOKEN"))
     private User user;


     // setting up constructors
     public VerifyToken(User user,String token){
        super();
        this.user=user;
        this.token=token;
        this.expireTime = calculateExpireDate();
     }

}
