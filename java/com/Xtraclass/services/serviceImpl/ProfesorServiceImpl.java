package com.Xtraclass.services.serviceImpl;

import com.Xtraclass.entities.Profesor;
import com.Xtraclass.repositories.ProfesorRepository;
import com.Xtraclass.resource.ProfesorResource;
import com.Xtraclass.resource.SaveProfesorResource;
import com.Xtraclass.services.ProfesorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfesorServiceImpl implements ProfesorService {

    @Autowired
    ProfesorRepository profesorRepository;

    private static final ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<ProfesorResource> getAll() throws Exception {
        final List<Profesor> profesores =profesorRepository.findAll();
        return profesores.stream().map(service->modelMapper.map(service, ProfesorResource.class)).collect(Collectors.toList());
    }

    @Override
    public ProfesorResource getById(Long id) throws Exception {
        final Profesor profesor= profesorRepository.findById(id).orElseThrow(()->new Exception("Profesor no encontrado"));
        return modelMapper.map(profesor,ProfesorResource.class);
    }

    @Override
    public ProfesorResource createProfesor(SaveProfesorResource saveProfesorResource) throws Exception {
        Profesor profesor= modelMapper.map(saveProfesorResource,Profesor.class);
        try {
            profesor= profesorRepository.save(profesor);
            System.out.println("Profesor creado");
        }catch (Exception e){
            throw new Exception("Internal Server error");
        }
        return modelMapper.map(profesor,ProfesorResource.class);
    }

    @Override
    public ProfesorResource updateProfesor(SaveProfesorResource saveProfesorResource, Long id) throws Exception {
        return null;
    }
}
