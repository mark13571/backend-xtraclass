package com.Xtraclass.resource;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
public class SaveAlumnoResource {

    private String nombre;

    private String correo;

    @Size(max=6)
    private String usuario;
    @Size(max=13)
    private String contrasenia;

    private boolean tipo;
}
