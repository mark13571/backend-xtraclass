package com.Xtraclass.services;

import com.Xtraclass.resource.ProfesorResource;
import com.Xtraclass.resource.SaveProfesorResource;

import java.util.List;

public interface ProfesorService {
    List<ProfesorResource> getAll() throws Exception;
    ProfesorResource getById(Long id) throws Exception;
    ProfesorResource createProfesor(SaveProfesorResource saveProfesorResource) throws Exception;
    ProfesorResource updateProfesor(SaveProfesorResource saveProfesorResource,Long id) throws Exception;

}
