
public abstract class Libro implements Prestable {
    
    private String titulo;
    private String nombreAutor;
    private String apellidoAutor;
    private String ISBN;
    private int anioPublicacion;
    private boolean disponiblePrestamo = true;
    private Persona personaPrestataria;
    


    protected Libro(){
        super();
    }

    protected Libro(String titulo, String nombreAutor, String apellidoAutor, String ISBN, int anioPublicacion, Persona personaPrestataria){
        this.titulo = titulo;
        this.nombreAutor =  nombreAutor;
        this.apellidoAutor = apellidoAutor;
        this.ISBN = ISBN;
        this.anioPublicacion = anioPublicacion;
        this.personaPrestataria = personaPrestataria;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getApellidoAutor() {
        return apellidoAutor;
    }

    public void setApellidoAutor(String apellidoAutor) {
        this.apellidoAutor = apellidoAutor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

      public boolean isDisponiblePrestamo() {
        return disponiblePrestamo;
    }

    public void setDisponiblePrestamo(boolean disponiblePrestamo) {
        this.disponiblePrestamo = disponiblePrestamo;
    }

    public Persona getPersonaPrestataria(){
        return personaPrestataria;
    }

    public void setPersonaPrestataria(Persona personaPrestataria){
        this.personaPrestataria = personaPrestataria;
    }

    

    public abstract double calcularPenalizacion(int diasRetraso);

    public String informacionComun(){
        return "Titulo: " + this.getTitulo() + "/n" + "Nombre autor: " + this.getNombreAutor() + "/n" + "Apellido autor: " +  this.getApellidoAutor() + "/n" + "ISBN: " + this.getISBN() + "/n" + "Año publicacion: " + this.getAnioPublicacion() + "/n" + "Disponible para prestamo: " +this.isDisponiblePrestamo();
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", nombreAutor=" + nombreAutor + ", apellidoAutor=" + apellidoAutor
                + ", ISBN=" + ISBN + ", anioPublicacion=" + anioPublicacion + ", disponiblePrestamo="
                + disponiblePrestamo + "]";
    }
    

  
    
}
