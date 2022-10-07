package com.example.backend.services;

import com.example.backend.converters.ventaConverter;
import com.example.backend.data.ventaData;
import com.example.backend.entities.venta;
import com.example.backend.respositories.ventaRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ventaService {
    @Autowired

    private ventaRepository ventaRepository;
    private ventaConverter ventaConverter = new ventaConverter();

    // Servicio para registrar en la BD(en la cual se realiza la conversion de
    // adentro hacia afuera
    public ventaData insert(ventaData venta) {
        if (ventaRepository.existsById(venta.getId()))
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Venta existente");
        return ventaConverter.toData(ventaRepository.save(ventaConverter.toEntity(venta)));
    }

    // service for query all in the table
    public List<ventaData> findAll() {
        return ventaConverter.toData(ventaRepository.findAll());
    }

    // query aplication by Id
    public ventaData findById(int id) {
        Optional<venta> venta = ventaRepository.findById(id);
        if (venta.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Venta no existe");
        return ventaConverter.toData(venta.get());
    }

    // Update Aplication
    public ventaData update(ventaData venta) {
        if (!ventaRepository.existsById(venta.getId()))
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Venta no existe");
        return ventaConverter.toData(ventaRepository.save(ventaConverter.toEntity(venta)));
    }

    // Delete aplication
    public ventaData DeleteById(int id) {
        Optional<venta> venta = ventaRepository.findById(id);
        if (venta.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Venta no existe");
        ventaRepository.deleteById(id);
        ventaData ventaData = ventaConverter.toData(venta.get());
        return ventaData;
    }
}
