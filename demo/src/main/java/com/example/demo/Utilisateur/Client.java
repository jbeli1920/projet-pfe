package com.example.demo.Utilisateur;

import com.example.demo.intervention.Intervention;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Client {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Relationships
    @OneToMany(mappedBy = "client")
    private List<Intervention> interventions;

    // Getters and Setters
}
