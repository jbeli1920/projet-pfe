package com.example.demo.intervention;

import jakarta.persistence.*;

@Entity
public class EtapesIntervention {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean realisee;

    // Relationships
    @ManyToOne
    private Intervention intervention;

    @ManyToOne
    private EtapesTypeIntervention etapesType;

    // Getters and Setters
}
