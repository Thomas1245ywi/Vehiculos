package com.example.Vehiculos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Vehiculos.interfacesServices.IMarcaServices;
import com.example.Vehiculos.interfacesServices.IVehiculoServices;
import com.example.Vehiculos.models.Marca;
import com.example.Vehiculos.models.Vehiculo;

import javax.validation.Valid;



@Controller
@RequestMapping
public class Controlador {


    @Autowired
    private IVehiculoServices iVehiculoServices;

    @Autowired
    private IMarcaServices iMarcaServices;
    

    @GetMapping("")
    public String listar(Model model){

        List<Vehiculo> vehiculos = iVehiculoServices.listar();
        model.addAttribute("vehiculos", vehiculos);
        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model model){


        List<Marca> marcas = iMarcaServices.obtenerTodos();
        model.addAttribute("marcas", marcas);

        model.addAttribute("vehiculo", new Vehiculo());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Valid Vehiculo vehiculo, Model model){

        iVehiculoServices.save(vehiculo);
        return "redirect:/";

    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        List<Marca> marcas = iMarcaServices.obtenerTodos();
        model.addAttribute("marcas", marcas);

        Optional<Vehiculo> vehiculo =  iVehiculoServices.listarPorID(id);
        model.addAttribute("vehiculo", vehiculo);
        return "form";

    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable int id, Model model){

        iVehiculoServices.delete(id);
        
        return "redirect:/";

    }
}
