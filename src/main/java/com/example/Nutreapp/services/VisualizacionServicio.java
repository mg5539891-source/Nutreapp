package com.example.Nutreapp.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Nutreapp.repositories.IVisualizacionRepositorio;
import com.example.Nutreapp.models.Visualizacion;


public class VisualizacionServicio {

    //INVECCION DE DEPENDENCIAS
    @Autowired 
    private IVisualizacionRepositorio Repositorio;

    //metodo para guardar
    public Visualizacion guardar(Visualizacion datos){
        return this.Repositorio.save(datos);
    
    }
    
    //metodo para buscar por id
    
    //metodo para buscar todos
    
    //metodo para modificar
    
    //metodo para eliminar
    
    //metodo para buscar por depto y rol
    
    //metodo para buscar por correo
    
    //metodo para buscar por rol
    
    //metodo para evrificar correo


}
