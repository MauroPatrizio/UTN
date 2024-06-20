package com.example.MiApiRest.services;

import com.example.MiApiRest.entities.Empleado;
import com.example.MiApiRest.repositories.EmpleadoRepository;
import com.example.MiApiRest.repositories.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    private EmpleadoRepository empleadoRepository;

    public Empleado crearEmpleado(Empleado empleado){
        return empleadoRepository.save(empleado);
    }

    public List<Empleado> listarEmpleados(){
        return empleadoRepository.findAll();
    }

    public Empleado buscarEmpleadoPorId(Long id){
        return empleadoRepository.findById(id).orElse(null);
    }

    public Empleado actualizarEmpleado(Empleado empleado){
        return empleadoRepository.save(empleado);
    }

    public void eliminarEmpleado(Long id){
        empleadoRepository.deleteById(id);
    }
}
