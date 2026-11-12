package com.example.Nutreapp.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Nutreapp.models.Usuario;

@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario, UUID>{

    //consultas prefabricadas 

    //1. buscar usuario asociado a un departemento y un rol especifico
    List<Usuario> findByDepartamentoAndRol(String departamento, String rol);

    Optional<Usuario> findByCorreo(String correo);

    List<Usuario> findByRolOrderByNombreAsc(String rol);

    boolean existsByCorreo(String correo);
    

}
