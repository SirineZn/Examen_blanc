package com.example.examen_blanc.services;

import com.example.examen_blanc.entities.FamilleActe;
import com.example.examen_blanc.repositories.FamilleActeRepository;

public class IFamilleActeServiceImpl implements IFamilleActeService{
    FamilleActeRepository familleActeRepository;
    @Override
    public FamilleActe ajouterFamilleActeEtActeAssocie(FamilleActe facte) {
        return familleActeRepository.save(facte);
    }
}
