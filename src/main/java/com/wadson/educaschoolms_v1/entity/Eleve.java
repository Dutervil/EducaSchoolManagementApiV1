package com.wadson.educaschoolms_v1.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Eleve {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private  String code;
    private String nom;
    private String prenom;
    private String sexe;
    private  String dateNaissace;
    private String adresse;
    private String villeNaissance;
    private String nomMere;
    private String nomPere;
    private String nomResponsable;
    private String phoneResponsable;
//    private String

}
