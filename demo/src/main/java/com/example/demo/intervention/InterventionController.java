package com.example.demo.intervention;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/interventions")
public class InterventionController {
    @Autowired
    private InterventionService interventionService;

    @GetMapping
    public List<Intervention> getAllInterventions() {
        return interventionService.findAll();
    }

    @PostMapping
    public Intervention createIntervention(@RequestBody Intervention intervention) {
        return interventionService.save(intervention);
    }
}

