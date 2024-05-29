package com.digitalisation.ims.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "document")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="date/heure")
    private String date;
    @Column(name="fichier")
    private String fichier;
}

