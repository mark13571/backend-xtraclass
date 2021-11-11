package com.Xtraclass.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="cursos")
@Data
public class Curso implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombrecurso")
    private String nombrecurso;

    @Column(name="seccion")
    private String seccion;

    @Column(name="iniciof")
    private Date iniciof;

    @Column(name="finalf")
    private Date finalf;

    @Column (name="hora")
    private String hora;

    @Column
    private boolean status;

    @Column
    private Integer vacantes;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_profesor",nullable=false)
    private Profesor profesor;

    /*public Curso(String nombrecurso, String seccion, Date iniciof, Date finalf, String hora, Profesor profesor) {
        this.nombrecurso = nombrecurso;
        this.seccion = seccion;
        this.iniciof = iniciof;
        this.finalf = finalf;
        this.hora = hora;
        this.profesor = profesor;
    }*/
}
