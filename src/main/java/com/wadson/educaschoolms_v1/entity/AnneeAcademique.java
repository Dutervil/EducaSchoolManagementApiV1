package com.wadson.educaschoolms_v1.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AnneeAcademique {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String annee_debut;
    private String annee_fin;
    private String date_debut;
    private String date_fin;
    private String etat;
}
