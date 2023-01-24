package com.tecazuay.demospringboots3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Curso {
    @Id
    @GeneratedValue
    private Integer id;

    private String titulo;

    @NonNull
    private String imagenPath;

    @Transient
    private String imagenUrl;


}
