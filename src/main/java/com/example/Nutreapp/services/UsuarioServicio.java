package com.example.Nutreapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Nutreapp.models.Usuario;
import com.example.Nutreapp.repositories.IUsuarioRepositorio;

@Service
public class UsuarioServicio {

    //para cocinar necesito las recetas
    // para programar los servicios necesito los repositorios

    //INVECCION DE DEPENDENCIAS
    @Autowired 
    private IUsuarioRepositorio Repositorio;


    //metodo para guardar
    public Usuario guardar(Usuario datos){
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
