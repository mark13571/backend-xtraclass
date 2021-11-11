package com.Xtraclass.entities;

import lombok.Data;

import javax.persistence.*;

/*@Entity
@Table(name="matriculas")
@Data
public class Matricula {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idalumno",nullable = false)
    private Alumno alumno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idcurso",nullable = false)
    private Curso curso;
}*/
