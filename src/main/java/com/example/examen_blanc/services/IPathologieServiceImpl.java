package com.example.examen_blanc.services;

import ch.qos.logback.core.util.FixedDelay;
import com.example.examen_blanc.entities.Acte;
import com.example.examen_blanc.entities.Pathologie;
import com.example.examen_blanc.repositories.PathologieRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
@Slf4j
public class IPathologieServiceImpl implements IPathologieService{
    PathologieRepository pathologieRepository;
    @Override
    public Pathologie ajouterPathologie(Pathologie path) {
        return pathologieRepository.save(path);
    }

    @Override
    public float calculerFacture(String identifiant) {
        float f=0;
        Pathologie pathologie = pathologieRepository.findByCodePath(identifiant);
        if (!pathologie.getArchive()) {
           List<Acte> acts= (List<Acte>) pathologie.getActes();
           for(Acte acte : acts) {
               f += acte.getCotationActe() * acte.getPrixUnitaireActe();
           }
        }
        return f;
    }

    @Scheduled(fixedDelay = 30)
    public void calculerNombreActesParPathologie() {
        //List<Pathologie> pathologies = pathologieRepository.retrieveAllPathology();
        List<Pathologie> pathologies = pathologieRepository.findAll();
        for (Pathologie path:pathologies){
            log.info("le nombre d'actes par pathologies est : "+ String.valueOf(path.getActes().stream().count()));
        }

    }
}
