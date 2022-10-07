package com.example.backend.entities;

//import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;

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

public class cliente {
    /* Con las siguientes 3 líneas definimos PK, por medio de @Id */
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String nombreCliente;

    @Column(nullable = false, unique = true)
    private String celularCliente;

    // @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    // private List<cliente> cliente;
    // // getter and setter

}
