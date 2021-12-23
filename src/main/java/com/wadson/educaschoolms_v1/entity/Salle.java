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
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSalle;
    private String nom;
    private int capacite;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Classe classe;

}
