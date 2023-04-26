package com.example.examen_blanc.services;

import com.example.examen_blanc.entities.Pathologie;

public interface IPathologieService {

    Pathologie ajouterPathologie(Pathologie path);
    public float calculerFacture(String identifiant);
    public void calculerNombreActesParPathologie();
}
