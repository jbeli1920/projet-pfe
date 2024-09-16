package com.example.demo.intervention;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterventionService {
    @Autowired
    private InterventionRepository interventionRepository;

    public List<Intervention> findAll() {
        return interventionRepository.findAll();
    }

    public Intervention save(Intervention intervention) {
        return interventionRepository.save(intervention);
    }

    // Other methods
}

