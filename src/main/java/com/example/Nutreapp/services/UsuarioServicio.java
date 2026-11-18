package com.example.Nutreapp.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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
    public Usuario buscarPorId(UUID id){
        Optional<Usuario> usuarioBuscado =this.Repositorio.findById(id);
        if(!usuarioBuscado.isPresent()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id no encontrado");

      } else {
        return usuarioBuscado.get();
      }
    }
            
    
    //metodo para buscar todos
    public List<Usuario> buscarTodos(){
        return this.Repositorio.findAll();
    }
    
    //metodo para modificar
    
    //metodo para eliminar
    
    //metodo para buscar por depto y rol
    
    //metodo para buscar por correo
    
    //metodo para buscar por rol
    
    //metodo para evrificar correo

}
