package com.example.backend.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class productosData {

    private int id;
    private int cantidad;
    private int precioUnitario;
    private String nombreProducto;

}
