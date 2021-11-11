package com.Xtraclass.services.serviceImpl;

import com.Xtraclass.entities.Curso;
import com.Xtraclass.entities.Profesor;
import com.Xtraclass.repositories.CursoRepository;
import com.Xtraclass.repositories.ProfesorRepository;
import com.Xtraclass.resource.CursoResource;
import com.Xtraclass.resource.SaveCursoResource;
import com.Xtraclass.services.CursoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private ProfesorRepository profesorRepository;

    private static final ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<CursoResource> getAll() throws Exception {
        return null;
    }

    @Override
    public CursoResource getById(Long id) throws Exception {
        return null;
    }

    @Override
    public CursoResource createCurso(SaveCursoResource saveCursoResource) throws Exception {
        Curso curso= new Curso();
       /*Profesor profesor=new Profesor();*/
        Profesor profesor=profesorRepository.findById(saveCursoResource.getProfesorId()).orElseThrow(()->new Exception("Profesor no encontrado"));
        try {
            curso.setNombrecurso(saveCursoResource.getNombrecurso());
            curso.setSeccion(saveCursoResource.getSeccion());
            curso.setIniciof(saveCursoResource.getIniciof());
            curso.setFinalf(saveCursoResource.getFinalf());
            curso.setHora(saveCursoResource.getHora());
            curso.setStatus(true);
            curso.setProfesor(profesor);
            System.out.println("curso creado");
            return  modelMapper.map(curso, CursoResource.class);
        }catch (Exception e) {
            throw new Exception("Internal Server error");
        }

    }

    @Override
    public CursoResource updateCurso(SaveCursoResource saveCursoResource, Long id) throws Exception {
        return null;
    }
}
