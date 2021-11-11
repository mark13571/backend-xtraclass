package com.Xtraclass.controller;

import com.Xtraclass.exception.XtraClassResponse;
import com.Xtraclass.resource.AlumnoResource;
import com.Xtraclass.resource.SaveAlumnoResource;
import com.Xtraclass.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path="/alumno")
public class AlumnoController {
    @Autowired
    AlumnoService alumnoService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    XtraClassResponse<List<AlumnoResource>> getAllAlumnos() throws Exception{
        return new XtraClassResponse<>("200","Lista de Alumnos", alumnoService.getAll());
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    XtraClassResponse<AlumnoResource>getAlumno(@PathVariable Long id) throws Exception{
        return new XtraClassResponse<>("200","Alumno consultado", alumnoService.getById(id));
    }
    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/create")
    XtraClassResponse<AlumnoResource> createAlumno(@RequestBody @Valid SaveAlumnoResource saveAlumnoResource)throws Exception{
        return new XtraClassResponse<>("200","Alumno creado", alumnoService.createAlumno(saveAlumnoResource));
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/update/{id}")
    XtraClassResponse<AlumnoResource>updateAlumno(@RequestBody @Valid SaveAlumnoResource saveAlumnoResource,@PathVariable Long id)throws Exception{
        return new XtraClassResponse<>("200","Alumno actualizado", alumnoService.updateAlumno(saveAlumnoResource, id));
    }
}
