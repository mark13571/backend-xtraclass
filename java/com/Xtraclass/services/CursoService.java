package com.Xtraclass.services;

import com.Xtraclass.resource.CursoResource;
import com.Xtraclass.resource.SaveCursoResource;

import java.util.List;

public interface CursoService {
    List<CursoResource> getAll() throws Exception;
    CursoResource getById(Long id) throws Exception;
    CursoResource createCurso(SaveCursoResource saveCursoResource) throws Exception;
    CursoResource updateCurso(SaveCursoResource saveCursoResource, Long id) throws Exception;
}
