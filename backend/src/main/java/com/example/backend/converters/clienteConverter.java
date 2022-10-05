package com.example.backend.converters;

import com.example.backend.data.clienteData;
import com.example.backend.entities.cliente;

public class clienteConverter extends converter<cliente, clienteData> {

    @Override
    public cliente toEntity(clienteData object) {
        return object == null ? null
                : cliente.builder()
                        .id(object.getId())
                        .nombreCliente(object.getNombreCliente())
                        .celularCliente(object.getCelularCliente())
                        .build();
    }

    @Override
    public clienteData toData(cliente object) {
        return object == null ? null
                : clienteData.builder()
                        .id(object.getId())
                        .nombreCliente(object.getNombreCliente())
                        .celularCliente(object.getCelularCliente())
                        .build();
    }
}
