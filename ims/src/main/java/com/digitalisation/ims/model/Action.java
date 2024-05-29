package com.digitalisation.ims.model;

import jakarta.persistence.*;
import lombok.*;
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Action")
public class Action {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column
        private Long id;
        @Column(name="existe")
        private boolean oui;
        @Column
        private String detail;
        @Column
        private String attachement;
        @Column
        private String statut;
        @Column
        private String controle;
        @Column
        private String commentaire;

    }
