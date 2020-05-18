package com.uca.capas.tareal5.domain;
import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(schema = "public", name = "estudiante")
public class Estudiante {
    @Id
    @Column(name = "c_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    
    @Column(name = "nombre")
    @NotBlank(message = "el campo no debe estar vacio")
    @NotEmpty(message = "El campo nombre no debe estar vacio")
    private String nombre;
    
    @Column(name = "apellido")
    @NotEmpty(message = "El campo Apellido no debe estar vacio")
    private String apellido;
    
    @Column(name = "carne")
    @NotEmpty(message = "El campo del carnet no debe estar vacio")
    @Size(min=8, max=8,  message = "Debe tener 8 digitos exactos.")
    private String carne;
    
    @Column(name = "carrera")
    @NotEmpty(message = "El campo carrera no debe estar vacio")
    private String carrera;
    
    public Estudiante(){}

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
