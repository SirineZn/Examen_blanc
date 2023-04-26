package com.example.examen_blanc.repositories;

import com.example.examen_blanc.entities.Acte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActeRepository extends JpaRepository<Acte, Long> {
    public Acte findByCodeActe(String codeActe);
}
