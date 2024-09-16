package com.example.demo.intervention;

import jakarta.persistence.*;

@Entity
public class TypeIntervention {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String desType;

    // Getters and Setters
}
