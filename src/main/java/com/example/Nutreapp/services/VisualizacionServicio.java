package com.example.Nutreapp.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

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
}
    
    //metodo para buscar por id
    public Visualizacion buscarPorId(UUID id){
        Optional<Visualizacion> visualizacionBuscada =this.Repositorio.findById(id);
        if(!visualizacionBuscada.isPresent()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id no encontrado");

      } else {
        return visualizacionBuscada.get();
      }
    }
    
    //metodo para buscar todos
    public List<Visualizacion> buscarTodos(){
        return this.Repositorio.findAll();
    }
    //metodo para modificar
    
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



