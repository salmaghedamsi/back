package com.digitalisation.ims.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "rapport")
public class rapport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nchangement;
    private String typeDocument;
    private String nrInstruction;
    private String titreDocument;
    private String raison;
    private String contenuDetaille;
    private String etat;
    private String application;
    private String mj;
    private String déviation;
    private String action;
    private String responsable;
    private String delai;
    private String cs;





}
