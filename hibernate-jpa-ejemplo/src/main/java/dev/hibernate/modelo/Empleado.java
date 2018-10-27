
package dev.hibernate.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author rubensegura
 */

@Entity
@Table(name = "EMPLEADO")
public class Empleado implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "COD_EMPLEADO")
    private Long codigo;
    
    @Column(name = "NOMBRE")
    private String nombre;
    
    @Column(name = "APELLIDOS")
    private String apellidos;
     
    @Column(name = "FECHA_NACIMIENTO")
    private Date fechaNacimiento;

    public Empleado() {
        
    }

    public Empleado(Long codigo, String nombre, String apellidos, Date fechaNacimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
    
}
