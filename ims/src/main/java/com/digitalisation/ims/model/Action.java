package com.digitalisation.ims.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

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
        @Column(name = "nom")
        private String name;
        @Column(name="existe")
        private String oui;
        private Date delai;
        @Column
        private String detail;
        @Column
        private String attachement;
        @Column
        private String statut;
        private String responsable;

        @Column
        private String commentaire;
        @ManyToOne
        @JoinColumn(name = "instruction_id")
        private instruction instruction;

        @PrePersist
        protected void onCreate() {
                if (this.oui == "") {
                        this.oui = "oui";
                }
                if (this.statut == "") {
                        this.statut = "en progés";
                }
        }
    }
