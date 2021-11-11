package com.Xtraclass.services;

import com.Xtraclass.resource.AlumnoResource;
import com.Xtraclass.resource.SaveAlumnoResource;

import java.util.List;

public interface AlumnoService {
    List<AlumnoResource> getAll() throws Exception;
    AlumnoResource getById(Long id) throws Exception;
    AlumnoResource createAlumno(SaveAlumnoResource saveAlumnoResource) throws Exception;
    AlumnoResource updateAlumno(SaveAlumnoResource saveAlumnoResource,Long id) throws Exception;
    String deleteAlumno(Long id) throws Exception;
}
