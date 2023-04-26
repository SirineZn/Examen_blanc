package com.example.examen_blanc.controllers;

import com.example.examen_blanc.entities.Pathologie;
import com.example.examen_blanc.services.IPathologieService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class PathologieController {
    IPathologieService iPathologieService;
    @PostMapping("/addPathologie")
    public Pathologie ajouterPathologie(@RequestBody Pathologie pathologie) {
        return iPathologieService.ajouterPathologie(pathologie);
    }
    @PostMapping("/affecterActeAPathologie/{codeA}/{codeP}")
    public void affecterActeAPathologie(@PathVariable("codeA")String codeActe, @PathVariable("codeP") String codePathologie ){

    }
    @GetMapping("/calculFacture/{id}")
    public float calculerFacture(@PathVariable("id") String identifiant) {
        return iPathologieService.calculerFacture(identifiant);
    }
}
