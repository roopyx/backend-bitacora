package com.lavv.springboot.backendbitacora.services;

import com.lavv.springboot.backendbitacora.models.entities.Rol;
import com.lavv.springboot.backendbitacora.repositories.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class RolServiceImpl implements RolService {

    @Autowired
    private RolRepository rolRepository;

    @Override
    @Transactional
    public Rol save(Rol rol) {
        return rolRepository.save(rol);
    }

    @Override
    @Transactional
    public Optional<Rol> findByNombre(String nombre) {
        return rolRepository.findByNombre(nombre);
    }

    @Override
    @Transactional
    public List<Rol> findAll() {
        return (List<Rol>) rolRepository.findAll();
    }


}
