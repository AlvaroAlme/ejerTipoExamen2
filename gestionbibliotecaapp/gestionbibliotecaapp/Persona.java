package gestionBibliotecaApp.gestionBibliotecaApp;
import java.util.Date;

public class Persona{

    private String nombre;
    private String apellido;
    private String dni;
    private Date fechaNacimiento;

    public Persona(){
        super();
    }

    public Persona(String nombre, String apellido, String dni, Date fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
}