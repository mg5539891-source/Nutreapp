package com.example.Nutreapp.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Nutreapp.models.Video;

@Repository
public interface IVideoRepositorio extends JpaRepository<Video, UUID> {

    List<Video> findByCategoria(String categoria);

    
    List<Video> findByTituloContainingIgnoreCase(String titulo);

    
    List<Video> findByDescripcionContainingIgnoreCase(String descripcion);

    List<Video> findByUrl(String url);

    
    List<Video> findByTituloContainingIgnoreCaseAndCategoria(String titulo, String categoria);
}