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
public class ParametreAdmision {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  double moyAdmin;
    private double moyAjournee;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Classe classe;
}
