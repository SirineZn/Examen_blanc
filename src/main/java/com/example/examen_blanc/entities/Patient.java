package com.example.examen_blanc.entities;
import java.io.Serializable;
import java.util.Date;
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
public class Patient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idPatient", nullable = false)
    private Long idPatient;
    @Enumerated(EnumType.STRING)
    private TypePieceIdentite typePieceIdentite;
    private String identifiantPieceIdentite;
    @Temporal(TemporalType.DATE)
    private Date dateEmission;
    private String nomP;
    private String prenomP;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Pathologie> pathologies;
}
