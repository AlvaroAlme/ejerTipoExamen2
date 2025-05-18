package libro;

import java.util.Date;

public class Novela extends Libro {
    
    private String genero;
    private int numPaginas;
    private boolean versionDigital;

    public Novela(){
        super();
    }

    public Novela(String titulo, String nombreAutor, String apellidoAutor, String ISBN, Date anioPublicacion, String genero, int numPaginas, boolean versionDigital){
        super(titulo, nombreAutor, apellidoAutor, ISBN, anioPublicacion);
        this.genero = genero;
        this.numPaginas = numPaginas;
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
    public double calcularPenalizacion(){
        int diasRetraso = 0;
        double penalizacion = 0;
        
        return penalizacion = diasRetraso * 0.5;

    }

     @Override
     public String toString() {
        return "Novela [genero=" + genero + ", numPaginas=" + numPaginas + ", versionDigital=" + versionDigital
                + ", toString()=" + super.toString() + "]";
     }

    
    
}
