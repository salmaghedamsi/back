package com.digitalisation.ims.model;

import jakarta.persistence.*;
import lombok.*;


@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "instruction")
public class instruction {
    @Id
    @Column
    private String id;

    @Column(name = "titre")
    private String titre;
    @Column(name = "main_changes")
    private String main_changes;
    @Column(name = "process")
    private String process;
    @Column(name = "statut_etude_empact")
    private Integer StatutEI;
    @Column(name = "taux_de_retard")
    private Integer TauxdeRetard;
    private String responsable;
    @ManyToOne
    @JoinColumn(name = "imsId")
    private ims imsId;

}

