package com.example.examen_blanc.services;

import com.example.examen_blanc.entities.Acte;
import com.example.examen_blanc.entities.Pathologie;
import com.example.examen_blanc.repositories.ActeRepository;
import com.example.examen_blanc.repositories.PathologieRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j

public class IActeServiceImpl implements IActeService{
    ActeRepository acteRepository;
    PathologieRepository pathologieRepository;
    @Override
    public void affecterActeAPathologie(String codeActe, String codePathologie) {
        Acte acte = acteRepository.findByCodeActe(codeActe);
        Pathologie pathologie = pathologieRepository.findByCodePath(codePathologie);
        pathologie.getActes().add(acte);
        pathologie.setArchive(false);
        pathologieRepository.save(pathologie);

    }
}
