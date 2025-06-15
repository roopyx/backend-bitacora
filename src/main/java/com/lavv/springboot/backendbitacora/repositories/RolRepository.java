package com.lavv.springboot.backendbitacora.repositories;

import com.lavv.springboot.backendbitacora.models.entities.Rol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends CrudRepository<Rol, Integer> {

    //@Query("SELECT r FROM Rol r WHERE r.nombre = ?1")
    Optional<Rol> findByNombre(String nombre);
}
