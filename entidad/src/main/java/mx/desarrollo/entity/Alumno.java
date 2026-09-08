package mx.desarrollo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "alumno")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idalumno", nullable = false)
    private java.lang.Integer id;

    @NotNull
    @Column(name = "matricula", nullable = false)
    private java.lang.Integer matricula;

    @Size(max = 45)
    @NotNull
    @Column(name = "nombre", nullable = false, length = 45)
    private java.lang.String nombre;

    @Size(max = 45)
    @NotNull
    @Column(name = "apellidos", nullable = false, length = 45)
    private java.lang.String apellidos;

    @OneToMany(mappedBy = "idAlumno")
    private java.util.Set<Usuario> usuarios = new java.util.LinkedHashSet<>();

    public java.lang.Integer getId() {
        return id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(java.lang.Integer matricula) {
        this.matricula = matricula;
    }

    public java.lang.String getNombre() {
        return nombre;
    }

    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    public java.lang.String getApellidos() {
        return apellidos;
    }

    public void setApellidos(java.lang.String apellidos) {
        this.apellidos = apellidos;
    }

    public java.util.Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(java.util.Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}