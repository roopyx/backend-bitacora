package com.lavv.springboot.backendbitacora.controllers;

import com.lavv.springboot.backendbitacora.helpers.Validation;
import com.lavv.springboot.backendbitacora.models.entities.Rol;
import com.lavv.springboot.backendbitacora.services.RolService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/rol")
public class RolController {

    @Autowired
    private RolService service;


    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody Rol rol, BindingResult result) {

        if (result.hasErrors()) return Validation.validation(result);

        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(rol));

    }

    @GetMapping
    public ResponseEntity<?> findAll(){

        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{nombre}")
    public ResponseEntity<?> findByNombre(@PathVariable String nombre){

        return ResponseEntity.ok(service.findByNombre(nombre));
    }

}
