package com.example.examen_blanc.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Acte implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idActe", nullable = false)
    private Long idActe;
    private String codeActe;
    private Integer cotationActe;
    private Float prixUnitaireActe;
    private String designationActe;
    @ManyToOne
    FamilleActe familleActe;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "actes")
    private Set<Pathologie> pathologies;

}
