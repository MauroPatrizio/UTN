package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.Empleado;
import com.example.MiApiRest.services.EmpleadoService;
import org.hibernate.event.internal.EmptyEventManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @PostMapping()
    public Empleado crearEmpleado(@RequestBody Empleado empleado){
        return empleadoService.crearEmpleado(empleado);
    }

    @GetMapping()
    public List<Empleado> listarEmpleados(){
        return empleadoService.listarEmpleados();
    }

    @GetMapping("/{id}")
    public Empleado buscarEmpleadoPorId(Long id){
        return empleadoService.buscarEmpleadoPorId(id);
    }

    @PutMapping()
    public Empleado actualizarEmpleado(Empleado empleado){
        return empleadoService.actualizarEmpleado(empleado);
    }

    @DeleteMapping("/{id}")
    public void eliminarEmpleado(Long id){
        empleadoService.eliminarEmpleado(id);
    }
}
