package com.lavv.springboot.backendbitacora.controllers;

import com.lavv.springboot.backendbitacora.helpers.Validation;
import com.lavv.springboot.backendbitacora.models.entities.Escuadrilla;
import com.lavv.springboot.backendbitacora.services.EscuadrillaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/escuadrilla")
public class EscuadrillaController {

    @Autowired
    private EscuadrillaService service;

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody Escuadrilla escuadrilla, BindingResult result) {

        if (result.hasErrors()) return Validation.validation(result);

        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(escuadrilla));
    }

}
