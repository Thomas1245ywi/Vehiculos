package com.example.Vehiculos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Vehiculos.interfaces.IMarca;
import com.example.Vehiculos.interfacesServices.IMarcaServices;
import com.example.Vehiculos.models.Marca;

@Service
public class MarcaServices implements IMarcaServices{

    @Autowired
    private IMarca services;

    @Override
    public List<Marca> obtenerTodos() {

        return (List<Marca>)services.findAll();
        
        
    }
    
}
