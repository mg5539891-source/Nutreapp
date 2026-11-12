package com.example.Nutreapp.models;

import java.util.List;
import java.util.UUID;

import com.example.Nutreapp.models.helpers.Departamentos;
import com.example.Nutreapp.models.helpers.Rol;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID) 
    private UUID id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "correo", nullable = false, unique = true, length = 80)
    private String correo;

    @Enumerated(EnumType.STRING)
    @Column(name = "rol", nullable = false)
    private Rol rol;

    @Enumerated(EnumType.STRING)
    @Column(name = "departamento", nullable = false)
    private Departamentos departamento;

    @Column(name = "contrasena", nullable = false, length = 100)
    private String contrasenaHash; // Nomenclatura en CamelCase recomendada

    // Creando una relación
    @OneToMany(mappedBy = "usuario")
    @JsonManagedReference(value = "usuario_visualizacion")
    private List<Visualizacion> visualizaciones;
    
    // Constructor vacío
    public Usuario() {
    }

    // Constructor con parámetros básicos
    public Usuario(UUID id, String nombre, String correo, Rol rol, Departamentos departamento, String contrasenaHash) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
        this.departamento = departamento;
        this.contrasenaHash = contrasenaHash;
    }

    // Getters y Setters
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Rol getRol() {
        return rol;
    }
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    public Departamentos getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamentos departamento) {
        this.departamento = departamento;
    }
    public String getContrasenaHash() {
        return contrasenaHash;
    }
    public void setContrasenaHash(String contrasenaHash) {
        this.contrasenaHash = contrasenaHash;
    }
    public List<Visualizacion> getVisualizaciones() {
        return visualizaciones;
    }
    public void setVisualizaciones(List<Visualizacion> visualizaciones) {
        this.visualizaciones = visualizaciones;
    }
}