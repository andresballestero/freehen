package com.example.backend.converters;

import com.example.backend.data.ventaData;
import com.example.backend.entities.venta;

public class ventaConverter extends converter<venta, ventaData> {

    private clienteConverter clienteConverter = new clienteConverter();
    private productoConverter productoConverter = new productoConverter();

    @Override
    public venta toEntity(ventaData object) {
        return object == null ? null
                : venta.builder()
                        .id(object.getId())
                        .cliente(clienteConverter.toEntity(object.getCliente()))
                        .productos(productoConverter.toEntity(object.getProductos()))
                        .fecha(object.getFecha())
                        .build();

    }

    @Override
    public ventaData toData(venta object) {
        return object == null ? null
                : ventaData.builder()
                        .id(object.getId())
                        .cliente(clienteConverter.toData(object.getCliente()))
                        .productos(productoConverter.toData(object.getProductos()))
                        .fecha(object.getFecha())
                        .build();

    }

}
