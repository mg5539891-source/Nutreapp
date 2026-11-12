package com.example.Nutreapp.models;

import java.time.LocalDateTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference; 

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "visualizaciones")
public class Visualizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "fecha_visualizacion", nullable = false) 
    private LocalDateTime fechaVisualizacion;

    @Column(name = "completado", nullable = false)
    private Boolean completado;

    // Creando relaciones
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false) 
    @JsonBackReference(value = "usuario_visualizacion") 
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "video_id", nullable = false)
    private Video video;

    // Constructor vacío
    public Visualizacion() {
    }

    // Constructor con parámetros (incluyendo las relaciones)
    public Visualizacion(UUID id, LocalDateTime fechaVisualizacion, Boolean completado, Usuario usuario, Video video) {
        this.id = id;
        this.fechaVisualizacion = fechaVisualizacion;
        this.completado = completado;
        this.usuario = usuario;
        this.video = video;
    }

    // Getters y Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getFechaVisualizacion() {
        return fechaVisualizacion;
    }

    public void setFechaVisualizacion(LocalDateTime fechaVisualizacion) {
        this.fechaVisualizacion = fechaVisualizacion;
    }

    public Boolean getCompletado() {
        return completado;
    }

    public void setCompletado(Boolean completado) {
        this.completado = completado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}