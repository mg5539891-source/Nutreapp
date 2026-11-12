package com.example.Nutreapp.models;

import java.util.UUID;

import com.example.Nutreapp.models.helpers.Departamentos;
import com.example.Nutreapp.models.helpers.Rol;

import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;

public class Usuario {
    private UUID id;
    private String nombre;

    @Column(name = "correo", nullable = false, unique = true, length = 80)
    private String correo;

    @Enumerated(EnumType.STRING)
    @Column(name = "rol", nullable = false)
    private Rol rol;

    @Column(name = "departamento", nullable = false)
    private Departamentos departamento;

    @Column(name = "contrasena", nullable = false, length = 100)
    private String contrasena;
    
    // Constructor vacío
    public Usuario() {
    }

    // Constructor con parámetros
    public Usuario(UUID id, String nombre, String correo, Rol rol, Departamentos departamento, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
        this.departamento = departamento;
        this.contrasena = contrasena;
    }

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
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}