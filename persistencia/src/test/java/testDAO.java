import mx.desarrollo.persistence.dao.AlumnoDAO;
import mx.desarrollo.persistence.persistence.HibernateUtil;
import mx.desarrollo.entity.Alumno;
import jakarta.persistence.EntityManager;
import java.util.List;

public class testDAO {
    public static void main(String[] args) {
        try {
            EntityManager em = HibernateUtil.getEntityManager();
            System.out.println("Conexion establecida a la base de datos");

            AlumnoDAO alumnoDAO = new AlumnoDAO(em);

            List<Alumno> alumnos = em.createQuery("SELECT a FROM Alumno a", Alumno.class).getResultList();

            for (Alumno alumno : alumnos) {
                System.out.println(alumno.getNombre() + " || id [" + alumno.getId() + "]");
            }

            System.out.println("Prueba finalizada");

        } catch (Exception e) {
            System.out.println("Fallo la conexion");
            e.printStackTrace();
        }
    }
}