package com.lavv.springboot.backendbitacora.repositories;

import com.lavv.springboot.backendbitacora.models.entities.Escuadrilla;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscuadrillaRepository extends CrudRepository<Escuadrilla, Integer> {
}
