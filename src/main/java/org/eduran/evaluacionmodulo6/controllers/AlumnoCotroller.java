package org.eduran.evaluacionmodulo6.controllers;

import org.eduran.evaluacionmodulo6.models.dto.AlumnoDTO;
import org.eduran.evaluacionmodulo6.services.AlumnoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class AlumnoCotroller {

    @Autowired
    private AlumnoService service;

    @GetMapping("/listar_alumnos")
    public ResponseEntity<List<AlumnoDTO>> listarTodosLosAlumnos() {

        System.out.println("--------------------------------------------------------------------------------");
        try {
            List<AlumnoDTO> alumnos = service.listarTodosLosAlumnos();
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println(alumnos);
            System.out.println("--------------------------------------------------------------------------------");

            return new ResponseEntity<>(alumnos, HttpStatus.OK);
        } catch (Exception e) {
            return null;
        }
    }
}
