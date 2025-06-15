package com.lavv.springboot.backendbitacora.services;

import com.lavv.springboot.backendbitacora.models.entities.Rol;

import java.util.List;
import java.util.Optional;

public interface RolService {


    Rol save(Rol rol);

    Optional<Rol> findByNombre(String nombre);

    List<Rol> findAll();
}
