package com.recognitionprogram.userservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private String userEmail;
    private String userName;
    private String userPassword;
    private int totalPoints;
    private boolean isAdmin;
}
