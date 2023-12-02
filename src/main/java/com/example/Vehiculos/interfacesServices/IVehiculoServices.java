package com.example.Vehiculos.interfacesServices;
import java.util.List;
import java.util.Optional;

import com.example.Vehiculos.models.Vehiculo;

public interface IVehiculoServices {
    public List<Vehiculo>listar();
    public Optional<Vehiculo> listarPorID(int id);
    public int save(Vehiculo v);
    public void delete(int id);

}
