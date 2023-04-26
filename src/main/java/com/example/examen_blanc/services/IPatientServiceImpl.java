package com.example.examen_blanc.services;

import com.example.examen_blanc.entities.Pathologie;
import com.example.examen_blanc.entities.Patient;
import com.example.examen_blanc.repositories.PathologieRepository;
import com.example.examen_blanc.repositories.PatientRepository;

public class IPatientServiceImpl implements IPatientService{
    PathologieRepository pathologieRepository;
    PatientRepository patientRepository;

    @Override
    public Patient ajouterPatientEtAffecterAPathologie(Patient p, String codePath) {
        Pathologie pathologie = pathologieRepository.findByCodePath(codePath);
        p.getPathologies().add(pathologie);
        patientRepository.save(p);
        return p;

    }
}
