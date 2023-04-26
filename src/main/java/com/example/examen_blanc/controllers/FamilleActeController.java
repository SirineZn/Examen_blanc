package com.example.examen_blanc.controllers;

import com.example.examen_blanc.entities.FamilleActe;
import com.example.examen_blanc.repositories.FamilleActeRepository;
import com.example.examen_blanc.services.IFamilleActeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class FamilleActeController {
    IFamilleActeService iFamilleActeService;
    @PostMapping("/addFamille")
    public FamilleActe ajouterFamilleActeEtActeAssocie(@RequestBody FamilleActe facte) {

        return iFamilleActeService.ajouterFamilleActeEtActeAssocie(facte);
    }
}
