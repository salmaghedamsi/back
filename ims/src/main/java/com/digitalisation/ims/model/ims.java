package com.digitalisation.ims.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Builder
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ims")
public class ims {
    @Id
    private Double id;
    @Column(name = "date")
    private Date date;
    @Column(name = "responsable")
    private String responsable;
    @Column(name="traitementei")
    private Integer traitement;
    @Column(name="tauxretard")
    private Integer tauxretard;
    @Column(name="audit")
    private String audit;

    @Column(name="sucesscheck")
    private String sucesscheck;
    @PrePersist
    protected void onCreate() {
        if (this.sucesscheck == "") {
            this.sucesscheck = "en progrés";
        }
        if (this.audit == "") {
            this.audit = "en progrés";
        }
    }
}