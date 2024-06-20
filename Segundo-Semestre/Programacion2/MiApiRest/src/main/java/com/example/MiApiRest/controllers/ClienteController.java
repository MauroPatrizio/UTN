package com.example.MiApiRest.controllers;

import com.example.MiApiRest.entities.Cliente;
import com.example.MiApiRest.services.ClienteService;
import com.example.MiApiRest.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;
    @Autowired
    private EmpleadoService empleadoService;

    @PostMapping
    public Cliente crearCliente(@RequestBody Cliente cliente) { return clienteService.crearCliente(cliente);}

    @GetMapping
    public List<Cliente> getAllClients() {return  clienteService.listarClientes();}

    @GetMapping("/{id}")
    public Cliente buscarClientePorId(@PathVariable Long id) {return  clienteService.buscarClientePorId(id);}

    @PutMapping
    public Cliente actualizarCliente(@RequestBody Cliente cliente) {
        return clienteService.actualizarCliente(cliente);
    }

    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable Long id) { clienteService.eliminarCliente(id);}

}
