package com.example.backend.data;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.example.backend.entities.productos;
import com.example.backend.entities.cliente;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ventaData {
    private int id;
    private Date fecha;
    private cliente cliente;
    private productos productos;

}
