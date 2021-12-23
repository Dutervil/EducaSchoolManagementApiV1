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
public class Matiere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private int pointage;
    private String etat;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Category category;
}
