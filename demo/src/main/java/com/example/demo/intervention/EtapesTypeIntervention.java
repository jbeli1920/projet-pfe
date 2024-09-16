package com.example.demo.intervention;

import jakarta.persistence.*;

@Entity
public class EtapesTypeIntervention {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String desEtape;

    // Relationships
    @ManyToOne
    private TypeIntervention typeIntervention;

    // Getters and Setters
}
