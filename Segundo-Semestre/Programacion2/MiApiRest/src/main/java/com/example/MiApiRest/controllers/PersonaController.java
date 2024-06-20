package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.Persona;
import com.example.MiApiRest.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping() //localhost:3000/personas
    public Persona crearPersona(@RequestBody Persona persona){ //requestbody para que le diga que tiene que leer el json para extraer los atributos y ponerlos en el tipo que necesita la db
        return personaService.crearPersona(persona);
    }

    @GetMapping("/{id}")
    public Persona buscarPersonaPorId(@PathVariable Long id){ //lo que encuentra entre las llaves es lo que va a ocupar de variable
        return personaService.buscarPersonaPorId(id);
    }

    @GetMapping()
    public List<Persona> listarPersonas(){
        return personaService.listarPersonas();
    }

    @PutMapping()
    public Persona actualizarPersona(@RequestBody Persona persona){
        return  personaService.actualizarPersona(persona);
    }

    @DeleteMapping("/{id}")
    public void eliminarPersona(@PathVariable Long id){
        personaService.eliminarPersona(id);
    }
}
