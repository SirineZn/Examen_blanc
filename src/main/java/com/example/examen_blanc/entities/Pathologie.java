package com.example.examen_blanc.entities;

import java.io.Serializable;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pathologie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idPath", nullable = false)
    private Long idPath;
    private String codePath;
    private String libelle;
    private String description;
    private Boolean archive;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Acte> actes;
}
