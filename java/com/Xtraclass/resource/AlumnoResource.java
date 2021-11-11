package com.Xtraclass.resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlumnoResource{
    private Long id;
    private String nombre;
    private String correo;
    private String usuario;
    private String contrasenia;
    private boolean tipo;
}
