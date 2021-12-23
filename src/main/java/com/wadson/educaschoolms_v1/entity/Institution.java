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
public class Institution {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idInstitution;
    private String nom;
    private String sigle;
    private String dateFondation;
    private String directeur_fondateur;
    private String type;
    private String addresse;
    private String telephone;
    private String email;
    private String site_web;
    private String logo_url;
}
