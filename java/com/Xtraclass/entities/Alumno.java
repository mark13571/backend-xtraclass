package com.Xtraclass.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="alumnos")
@Data
@NoArgsConstructor
public class Alumno implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="correo")
    private String correo;

    @Column(name="usuario")
    private String usuario;

    @Column(name="contrasenia")
    private String contrasenia;

    @Column
    private boolean tipo;

    /*@OneToMany(fetch = FetchType.LAZY,mappedBy="alumno")
    private List<Matricula> matriculas;*/

    public Alumno(String nombre, String correo, String usuario, String contrasenia) {
        this.nombre = nombre;
        this.correo = correo;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
}
