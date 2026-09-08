package mx.desarrollo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario", nullable = false)
    private java.lang.Integer id;

    @Size(max = 45)
    @NotNull
    @Column(name = "correo", nullable = false, length = 45)
    private java.lang.String correo;

    @Size(max = 45)
    @NotNull
    @Column(name = "contrasena", nullable = false, length = 45)
    private java.lang.String contrasena;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idAlumno", nullable = false)
    private Alumno idAlumno;

    public java.lang.Integer getId() {
        return id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.String getCorreo() {
        return correo;
    }

    public void setCorreo(java.lang.String correo) {
        this.correo = correo;
    }

    public java.lang.String getContrasena() {
        return contrasena;
    }

    public void setContrasena(java.lang.String contrasena) {
        this.contrasena = contrasena;
    }

    public Alumno getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumno idAlumno) {
        this.idAlumno = idAlumno;
    }

}