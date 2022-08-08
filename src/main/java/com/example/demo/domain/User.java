package com.example.demo.domain;

import lombok.Data;

import java.security.PrivateKey;

@Data
public class User {
    private String UserName;
    private String Password;
    private String Type;

}
