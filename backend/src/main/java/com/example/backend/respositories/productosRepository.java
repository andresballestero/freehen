package com.example.backend.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.backend.entities.productos;

@Repository
public interface productosRepository extends JpaRepository<productos, Integer> {

}
