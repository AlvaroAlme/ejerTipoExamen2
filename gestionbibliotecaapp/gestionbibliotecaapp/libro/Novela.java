



public class Novela extends Libro {
    
    private String genero;
    private int numPaginas;
    private boolean versionDigital;

    public Novela(){
        super();
    }

    public Novela(String titulo, String nombreAutor, String apellidoAutor, String ISBN, int anioPublicacion,Persona personaPrestataria, String genero, int numPaginas, boolean versionDigital){
        super(titulo, nombreAutor,apellidoAutor,ISBN, anioPublicacion, personaPrestataria);
        this.genero = genero;
        this.numPaginas = numPaginas;
        this.versionDigital = versionDigital;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public boolean isVersionDigital() {
        return versionDigital;
    }

    public void setVersionDigital(boolean versionDigital) {
        this.versionDigital = versionDigital;
    }


     @Override
    public double calcularPenalizacion(int diasRetraso){
        double penalizacion;
        
        return penalizacion = diasRetraso * 0.5;

    }

     @Override
     public String toString() {
        return "Novela [genero=" + genero + ", numPaginas=" + numPaginas + ", versionDigital=" + versionDigital
                + ", toString()=" + super.toString() + "]";
     }

    
    
}
