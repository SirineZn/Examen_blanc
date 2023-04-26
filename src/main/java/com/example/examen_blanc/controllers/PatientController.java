package com.example.examen_blanc.controllers;

import com.example.examen_blanc.entities.Patient;
import com.example.examen_blanc.services.IPatientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PatientController {
    IPatientService iPatientService;

    @PostMapping("/addPatient/{codeP}")
    public Patient ajouterPatientEtAffecterAPathologie(@RequestBody Patient patient, @PathVariable("codeP") String codePath) {

        return iPatientService.ajouterPatientEtAffecterAPathologie(patient,codePath);
    }

}
