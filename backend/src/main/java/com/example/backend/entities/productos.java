package com.example.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class productos {
    /* Con las siguientes 3 líneas definimos PK, por medio de @Id */
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = false)
    private String nombreProducto;

    @Column(nullable = false, unique = false)
    private int precioUnitario;

    @Column(nullable = false, unique = false)
    private int cantidad;

}
