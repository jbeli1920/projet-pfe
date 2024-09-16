package com.example.demo.Utilisateur;

import com.example.demo.intervention.Intervention;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;
@Entity
@Getter
@Setter
@AllArgsConstructor  // Generates a constructor with arguments for all fields
@NoArgsConstructor
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private LocalDate dateCre;

    // Relationships
    @ManyToOne
    private Role role;

    @OneToMany(mappedBy = "id")
    private List<Intervention> interventions;

    // Getters and Setters
}
