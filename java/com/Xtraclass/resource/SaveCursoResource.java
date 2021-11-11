package com.Xtraclass.resource;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class SaveCursoResource {

    private String nombrecurso;
    private String seccion;
    private Date iniciof;
    private Date finalf;
    private String hora;
    private boolean status;
    private Integer vacantes;
    private Long profesorId;
}
