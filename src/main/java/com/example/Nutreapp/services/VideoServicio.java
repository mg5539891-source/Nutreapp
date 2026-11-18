package com.example.Nutreapp.services;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.example.Nutreapp.models.Video;
import com.example.Nutreapp.repositories.IVideoRepositorio;

public class VideoServicio {

    //INVECCION DE DEPENDENCIAS
    @Autowired 
    private IVideoRepositorio Repositorio;

    //metodo para guardar
     public Video guardar(Video datos){
        return this.Repositorio.save(datos);
    
    }
    
    //metodo para buscar por id
    public Video buscarPorId(UUID id){
        Optional<Video> videoBuscado =this.Repositorio.findById(id);
        if(!videoBuscado.isPresent()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id no encontrado");

      } else {
        return videoBuscado.get();
      }
    }
    
    //metodo para buscar todos
    public List<Video> buscarTodos(){
        return this.Repositorio.findAll();
    }
    
    //metodo para modificar
    public Video modificar(UUID id, Video datos){
        Optional<Video> videoBuscado =this.Repositorio.findById(id);
        if(!videoBuscado.isPresent()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id no encontrado");
      } else {
        Video videoExistente = videoBuscado.get();
        // Actualizar los campos del video existente con los datos proporcionados
        videoExistente.setTitulo(datos.getTitulo());
        videoExistente.setDescripcion(datos.getDescripcion());
        videoExistente.setUrl(datos.getUrl());
        // Agrega aquí cualquier otro campo que desees actualizar
        return this.Repositorio.save(videoExistente);
      }
    }
    
    //metodo para eliminar
    public boolean eliminar(UUID id){
        Optional<Video> videoBuscado =this.Repositorio.findById(id);
        if(!videoBuscado.isPresent()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id no encontrado");
      } else {
        this.Repositorio.deleteById(id);
        return true;
      }
    }
    //metodo para buscar por depto y rol
    
    //metodo para buscar por correo
    
    //metodo para buscar por rol
    
    //metodo para evrificar correo

}
