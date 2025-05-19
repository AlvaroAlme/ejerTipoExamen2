
public class LibroDeTexto extends Libro {
    
    private String curso;
    private String asignatura;
    private double precio;

    public LibroDeTexto() {
        super();
    }

    public LibroDeTexto(String titulo, String nombreAutor, String apellidoAutor, String ISBN, int anioPublicacion,Persona personaPrestataria, String curso, String asignatura, double precio){
        super(titulo, nombreAutor, apellidoAutor, ISBN, anioPublicacion, personaPrestataria);
        this.curso = curso;
        this.asignatura = asignatura;
        this.precio = precio;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

   @Override
    public double calcularPenalizacion(int diasRetraso){
        
        double penalizacion;
        if(diasRetraso > 3){
            penalizacion = diasRetraso * 0.3 + 2;
        } else {
            penalizacion = diasRetraso * 0.3;
        }
        return penalizacion;

    }

   @Override
   public String toString() {
    return "LibroDeTexto [curso=" + curso + ", asignatura=" + asignatura + ", precio=" + precio + ", toString()="
            + super.toString() + "]";
   }

    

}
