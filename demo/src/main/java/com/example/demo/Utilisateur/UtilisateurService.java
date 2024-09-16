package com.example.demo.Utilisateur;
import com.example.demo.Utilisateur.Utilisateur;
import com.example.demo.Utilisateur.UtilisateurRepository;
import com.example.demo.Utilisateur.dto.Logindto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public List<Utilisateur> findAll() {
        return utilisateurRepository.findAll();
    }

    public Utilisateur save(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public String login(Logindto loginData) {
        Optional<Utilisateur> utilisateur = this.utilisateurRepository.findByEmail(loginData.email);
        if (utilisateur.isEmpty()) {
            return "Compte n'existe pas";
        }

        Utilisateur u = utilisateur.get();
        if (u.getPassword().equals(loginData.password)) {
            return "succee";
        } else {
            return "erreur mot de pass ";
        }

        // Other methods
    }
}