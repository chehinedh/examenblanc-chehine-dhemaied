package com.example.chehinedh.controllers;

import com.example.chehinedh.entites.Personnel;
import com.example.chehinedh.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/personnel")
@RestController
public class ServiceController {
    @Autowired
    private IService iService;
    @PostMapping("/add-personnel")
    public Personnel ajouterPersonnel(@RequestBody Personnel personnel) {
       return iService.ajouterPersonnel(personnel);
    }
    @PutMapping("/affecter-personnel-zone/{idzone}/{idGarde}")
    public void affecterPersonnelZOne(@PathVariable Integer idzone, @PathVariable Integer idGarde) {
        iService.affecterPersonnelZOne(idzone, idGarde);
    }
}
