package com.example.backend.converters;

import com.example.backend.data.productosData;
import com.example.backend.entities.productos;

public class productoConverter extends converter<productos, productosData> {

    @Override
    public productos toEntity(productosData object) {
        return object == null ? null
                : productos.builder()
                        .id(object.getId())
                        .cantidad(object.getCantidad())
                        .precioUnitario(object.getPrecioUnitario())
                        .nombreProducto(object.getNombreProducto())
                        .build();
    }

    @Override
    public productosData toData(productos object) {
        return object == null ? null
                : productosData.builder()
                        .id(object.getId())
                        .cantidad(object.getCantidad())
                        .precioUnitario(object.getPrecioUnitario())
                        .nombreProducto(object.getNombreProducto())
                        .build();
    }

}
