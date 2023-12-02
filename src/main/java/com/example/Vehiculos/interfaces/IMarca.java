package com.example.Vehiculos.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Vehiculos.models.Marca;

@Repository
public interface IMarca extends CrudRepository< Marca, Integer>{
    
}
