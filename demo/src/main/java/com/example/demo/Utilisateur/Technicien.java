package com.example.demo.Utilisateur;

import com.example.demo.intervention.Intervention;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Technicien {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Relationships
    @OneToMany(mappedBy = "technicien")
    private List<Intervention> interventions;

    // Getters and Setters
}
