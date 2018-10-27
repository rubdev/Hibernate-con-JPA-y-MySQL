
package test;

import dev.hibernate.modelo.Empleado;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author rubensegura
 */
public class TestEmpleados {
    
    private static EntityManager manager;
    
    private static EntityManagerFactory emf;
    

    public static void main(String[] args) {
        
         emf = Persistence.createEntityManagerFactory("aplicacion");
         manager = emf.createEntityManager();
         
         Empleado ruben = new Empleado ((long)10, "Rubén", "Segura", new GregorianCalendar(1995, 3, 29).getTime());
         
         // Inicio transacción con BD
         manager.getTransaction().begin();
         
         // persisto el empleado nuevo en BD
         manager.persist(ruben);
         
         // Finalizo la transacción
         manager.getTransaction().commit();
         
         // muestro un listado de los empleados almacenados
         imprimirEmpleados();
         
    }
    
    // imprimo todos los datos de los empleados almacenados en BD
    private static void imprimirEmpleados() {
        List <Empleado> listaEmpleados = (List<Empleado>) manager.createQuery("FROM Empleado").getResultList();
        System.out.println("En esta base de datos hay: " + listaEmpleados.size() + " empleados");
        for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado.toString());
        }
    }
    
}
