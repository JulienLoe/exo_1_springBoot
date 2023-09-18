package com.example.exo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/home")
public class BaseRestController {
    @GetMapping
    public String getPersonFullName() {
        return "John DUPONT";
    }

    @GetMapping(value = "persons-details")
    public List<String> getPersonsDetails() {
        return List.of("John DUPONT", "24", "224 rue de calais");
    }

    @GetMapping(value = "persons-list")
    public List<String> getPersonsFullNames() {
        return List.of("John DUPONT", "Maria MARTEZ", "Chloée SMITH");
    }
}