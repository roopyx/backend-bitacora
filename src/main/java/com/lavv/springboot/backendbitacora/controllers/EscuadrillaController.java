package com.lavv.springboot.backendbitacora.controllers;

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

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/escuadrilla")
public class EscuadrillaController {

    @Autowired
    private EscuadrillaService service;

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody Escuadrilla escuadrilla, BindingResult result) {

        if (result.hasErrors()) return validation(result);

        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(escuadrilla));
    }

    private ResponseEntity<?> validation(BindingResult result) {

        Map<String, String> errors = new HashMap<>();

        result.getFieldErrors().forEach(err -> {
            errors.put(err.getField(), "El campo " + err.getField() + " " + err.getDefaultMessage());
        });

        return ResponseEntity.badRequest().body(errors);
    }

}
