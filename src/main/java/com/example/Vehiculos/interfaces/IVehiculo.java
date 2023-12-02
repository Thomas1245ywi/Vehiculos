package com.example.Vehiculos.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Vehiculos.models.Vehiculo;

@Repository
public interface IVehiculo extends CrudRepository<Vehiculo, Integer>{
    
}
