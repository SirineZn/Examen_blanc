package com.example.examen_blanc.repositories;

import com.example.examen_blanc.entities.FamilleActe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilleActeRepository extends JpaRepository<FamilleActe, Long> {
}
