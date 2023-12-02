package com.example.Vehiculos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Vehiculos.interfaces.IVehiculo;
import com.example.Vehiculos.interfacesServices.IVehiculoServices;
import com.example.Vehiculos.models.Vehiculo;


@Service
public class VehiculoService implements IVehiculoServices{


    @Autowired
    private IVehiculo iVehiculo;
    @Override
    public List<Vehiculo> listar() {

        return (List<Vehiculo>)iVehiculo.findAll();
    }

    @Override
    public int save(Vehiculo v) {
        int res = 0;
        Vehiculo vehiculo = iVehiculo.save(v);

        if(vehiculo != null){

            res = 1;
        }
        return 0;
    }

    @Override
    public void delete(int id) {
        iVehiculo.deleteById(id);

    }

    @Override
    public Optional<Vehiculo> listarPorID(int id) {
        
        return iVehiculo.findById(id);
    }

    
}
