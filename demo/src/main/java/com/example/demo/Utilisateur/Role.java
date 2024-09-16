package com.example.demo.Utilisateur;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Role {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String label;

    @ElementCollection
    private List<String> permissions;

    // Getters and Setters
}

