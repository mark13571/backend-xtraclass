package com.Xtraclass.controller;

import com.Xtraclass.exception.XtraClassResponse;
import com.Xtraclass.resource.ProfesorResource;
import com.Xtraclass.resource.SaveProfesorResource;
import com.Xtraclass.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path="/profesor")
public class ProfesorController {
    @Autowired
    ProfesorService profesorService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    XtraClassResponse<List<ProfesorResource>> getAllProfesores()throws Exception{
        return new XtraClassResponse<>("200","Listado de profesores", profesorService.getAll());
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    XtraClassResponse<ProfesorResource>getProfesor(@PathVariable Long id) throws Exception{
        return new XtraClassResponse<>("200","profesor consultado", profesorService.getById(id));
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/create")
    XtraClassResponse<ProfesorResource> createProfesor(@RequestBody @Valid SaveProfesorResource saveProfesorResource)throws Exception{
        return new XtraClassResponse<>("200","profesor creado", profesorService.createProfesor(saveProfesorResource));
    }
    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/update/{id}")
    XtraClassResponse<ProfesorResource>updateProfesor(@RequestBody @Valid SaveProfesorResource saveProfesorResource, @PathVariable Long id)throws Exception{
        return new XtraClassResponse<>("200","Profesor actualizado", profesorService.updateProfesor(saveProfesorResource, id));
    }
}
