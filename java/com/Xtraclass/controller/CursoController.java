package com.Xtraclass.controller;

import com.Xtraclass.exception.XtraClassResponse;
import com.Xtraclass.resource.CursoResource;
import com.Xtraclass.resource.SaveCursoResource;
import com.Xtraclass.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path="/curso")
public class CursoController {

    @Autowired
    CursoService cursoService;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/create")
    XtraClassResponse<CursoResource> createCurso(@RequestBody @Valid SaveCursoResource saveCursoResource) throws Exception{
        return new XtraClassResponse<>("200","curso creado",cursoService.createCurso(saveCursoResource));
    }
}
