package mx.desarrollo.facade;

import mx.desarrollo.delegate.DelegateAlumno;
import mx.desarrollo.entity.Alumno;
import mx.desarrollo.persistence.integration.ServiceLocator;

public class FacadeAlumno {

    private final DelegateAlumno delegateAlumno;

    public FacadeAlumno() {
        this.delegateAlumno = new DelegateAlumno();
    }

    public void guardarAlumno(Alumno alumno){
        delegateAlumno.saveAlumno(alumno);
    }

}
