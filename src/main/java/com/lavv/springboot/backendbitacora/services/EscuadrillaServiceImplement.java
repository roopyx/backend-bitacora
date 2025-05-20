package com.lavv.springboot.backendbitacora.services;

import com.lavv.springboot.backendbitacora.models.entities.Escuadrilla;
import com.lavv.springboot.backendbitacora.repositories.EscuadrillaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EscuadrillaServiceImplement implements EscuadrillaService {

    @Autowired
    private EscuadrillaRepository escuadrillaRepository;

    @Override
    @Transactional
    public Escuadrilla save(Escuadrilla escuadrilla) {
        return escuadrillaRepository.save(escuadrilla);
    }
}
