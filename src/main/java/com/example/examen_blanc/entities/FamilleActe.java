package com.example.examen_blanc.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FamilleActe implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idFA", nullable = false)
    private Long idFA;
    private String codeFA;
    private String libelle;
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "familleActe")
    private Set<Acte> actes;
}
