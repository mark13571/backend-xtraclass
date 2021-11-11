package com.Xtraclass.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="profesores")
@Data
public class Profesor implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombreprof")
    private String nombreprof;

    @Column(name="correoprof")
    private String correoprof;

    @Column(name="usuarioprof")
    private String usuarioprof;

    @Column(name="dniprof")
    private int dni;

    @Column(name="contraseniaprof")
    private String contraseniaprof;

    @OneToMany(fetch = FetchType.LAZY, mappedBy="profesor")
    private List<Curso>cursos;

   /* public Profesor(String nombreprof, String correoprof, String usuarioprof, int dni, String contraseniaprof) {
        this.nombreprof = nombreprof;
        this.correoprof = correoprof;
        this.usuarioprof = usuarioprof;
        this.dni = dni;
        this.contraseniaprof = contraseniaprof;
    }*/
}
