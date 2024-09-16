package com.example.demo.Utilisateur;

import com.example.demo.intervention.Intervention;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Responsable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "responsable")
    private List<Intervention> interventions;

    // Getters and Setters
}

