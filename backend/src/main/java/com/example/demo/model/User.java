package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private String email;
    private String username;
    private String password;

    // Getters and setters
}
