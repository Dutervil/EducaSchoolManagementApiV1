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
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idClasse;
    private String nom;
    private int position;
    private String etat;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Section section;
}
