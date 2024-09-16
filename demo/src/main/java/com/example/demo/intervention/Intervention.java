package com.example.demo.intervention;

import com.example.demo.Utilisateur.Client;
import com.example.demo.Utilisateur.Responsable;
import com.example.demo.Utilisateur.Technicien;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Intervention {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String desInterv;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String etat;

    // Relationships
    @ManyToOne
    private Client client;

    @ManyToOne
    private Technicien technicien;

    @ManyToOne
    private Responsable responsable;

    @OneToMany(mappedBy = "intervention")
    private List<EtapesIntervention> etapes;

    // Getters and Setters
}

