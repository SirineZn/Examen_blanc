package com.example.examen_blanc.services;

import com.example.examen_blanc.entities.Patient;

public interface IPatientService {
    Patient ajouterPatientEtAffecterAPathologie(Patient p, String codePath);
}
