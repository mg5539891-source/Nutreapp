package com.example.Nutreapp.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.Nutreapp.models.Visualizacion;

@Service 
public class VisualizacionServicio {

    // INYECCIÓN DE DEPENDENCIAS 
    @Autowired 
    private IVisualizacionRepositorio repositorio; 

    // Método para guardar
    public Visualizacion guardar(Visualizacion datos) {
        return this.repositorio.save(datos);
    }
    
    // Método para buscar por id
    public Visualizacion buscarPorId(UUID id) {
        Optional<Visualizacion> visualizacionBuscada = this.repositorio.findById(id);
        if (!visualizacionBuscada.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id no encontrado");
        } else {
            return visualizacionBuscada.get();
        }
    }
    
    // Método para buscar todos
    public List<Visualizacion> buscarTodos() {
        return this.repositorio.findAll();
    }
} 
    //metodo para modificar
    public Visualizacion modificar(UUID id, Visualizacion datos) {
        Optional<Visualizacion> visualizacionBuscada = this.repositorio.findById(id);
        if (!visualizacionBuscada.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id no encontrado");
        } else {
            Visualizacion visualizacionExistente = visualizacionBuscada.get();
            // Actualizar los campos de la visualización existente con los datos proporcionados
            visualizacionExistente.setUsuario(datos.getUsuario());
            visualizacionExistente.setVideo(datos.getVideo());
            visualizacionExistente.setFecha(datos.getFecha());
            // Agrega aquí cualquier otro campo que desees actualizar
            return this.repositorio.save(visualizacionExistente);
        }
    }
    
    //metodo para eliminar
    
    //metodo para buscar por depto y rol
    
    //metodo para buscar por correo
    
    //metodo para buscar por rol
    
    //metodo para evrificar correo

    //metodo para buscar todos
    
    //metodo para modificar
    
    //metodo para eliminar
    
    //metodo para buscar por depto y rol
    
    //metodo para buscar por correo
    
    //metodo para buscar por rol
    
    //metodo para evrificar correo



