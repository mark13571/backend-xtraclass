package com.Xtraclass.services.serviceImpl;

import com.Xtraclass.entities.Alumno;
import com.Xtraclass.repositories.AlumnoRepository;
import com.Xtraclass.resource.AlumnoResource;
import com.Xtraclass.resource.SaveAlumnoResource;
import com.Xtraclass.services.AlumnoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    private static final ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<AlumnoResource> getAll() throws Exception {
        final List<Alumno> alumnos= alumnoRepository.findAll();
        return alumnos.stream().map(service->modelMapper.map(service,AlumnoResource.class)).collect(Collectors.toList());
    }

    @Override
    public AlumnoResource getById(Long id) throws Exception {
        final Alumno alumno= alumnoRepository.findById(id).orElseThrow(()->new Exception("Alumno id no encontrado"));
        return modelMapper.map(alumno,AlumnoResource.class);
    }

    @Override
    public AlumnoResource createAlumno(SaveAlumnoResource saveAlumnoResource) throws Exception {
        Alumno alumno=modelMapper.map(saveAlumnoResource,Alumno.class);
        try {
            alumno=alumnoRepository.save(alumno);
            System.out.println("Alumno creado");
        }catch (Exception e){
            throw new Exception("Internal Server error");
        }
        return modelMapper.map(alumno,AlumnoResource.class);
    }

    @Override
    public AlumnoResource updateAlumno(SaveAlumnoResource saveAlumnoResource, Long id) throws Exception {
        return null;
    }

    @Override
    public String deleteAlumno(Long id) throws Exception {
        return null;
    }
}
