package com.example.examen_blanc.repositories;

import com.example.examen_blanc.entities.Acte;
import com.example.examen_blanc.entities.Pathologie;
import com.example.examen_blanc.entities.Patient;
import org.apache.catalina.LifecycleState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PathologieRepository extends JpaRepository<Pathologie, Long> {
    public Pathologie findByCodePath(String codePath);
    @Query("SELECT '*' FROM Pathologie")
    List<Pathologie> retrieveAllPathology();

}
