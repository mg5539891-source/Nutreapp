package com.example.Nutreapp.models;

import java.time.LocalDateTime;
import java.util.UUID;

public class Visualizacion {
    private UUID id;
    private LocalDateTime fecha_Visualizacion;
    private Boolean completado;

    public Visualizacion() {
    }

    public Visualizacion(UUID id, LocalDateTime fecha_Visualizacion, Boolean completado) {
        this.id = id;
        this.fecha_Visualizacion = fecha_Visualizacion;
        this.completado = completado;
    }

    // Getters y Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getFecha_Visualizacion() {
        return fecha_Visualizacion;
    }

    public void setFecha_Visualizacion(LocalDateTime fecha_Visualizacion) {
        this.fecha_Visualizacion = fecha_Visualizacion;
    }

    public Boolean getCompletado() {
        return completado;
    }

    public void setCompletado(Boolean completado) {
        this.completado = completado;
    }
}