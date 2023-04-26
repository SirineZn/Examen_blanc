package com.example.examen_blanc.services;

import com.example.examen_blanc.entities.Pathologie;
import com.example.examen_blanc.entities.Patient;
import com.example.examen_blanc.repositories.PathologieRepository;
import com.example.examen_blanc.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
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
