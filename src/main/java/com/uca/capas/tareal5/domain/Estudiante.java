package com.uca.capas.tareal5.domain;

import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

@Entity
@Table(schema = "public", name = "estudiante")
public class Estudiante {
    @Id
    @Column(name = "c_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "carne")
    private String carne;
    @Column(name = "carrera")
    private String carrera;
    public Estudiante(){}

    public Estudiante(String nombre, String apellido, String carne, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carne = carne;
        this.carrera = carrera;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carreran) {
        this.carrera = carreran;
    }
}
