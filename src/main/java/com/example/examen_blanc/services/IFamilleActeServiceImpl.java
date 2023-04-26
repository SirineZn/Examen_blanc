package com.example.examen_blanc.services;

import com.example.examen_blanc.entities.FamilleActe;
import com.example.examen_blanc.repositories.FamilleActeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class IFamilleActeServiceImpl implements IFamilleActeService{
    FamilleActeRepository familleActeRepository;
    @Override
    public FamilleActe ajouterFamilleActeEtActeAssocie(FamilleActe facte) {
        return familleActeRepository.save(facte);
    }
}
