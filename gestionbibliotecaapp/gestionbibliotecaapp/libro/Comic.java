
public class Comic extends Libro {

    private String dibujantePrincipal;
    private boolean isColor;
    private boolean isSerie;
    private int numEntregas;

    public Comic(){
        super();
    }

    public Comic (String titulo, String nombreAutor, String apellidoAutor, String ISBN, int anioPublicacion,Persona personaPrestataria, String dibujantePrincipal, String color, int numEntregas){
        super(titulo, nombreAutor, apellidoAutor, ISBN, anioPublicacion, personaPrestataria );
        this.dibujantePrincipal = dibujantePrincipal;
        this.isColor = isColor;
        this.numEntregas = numEntregas;
        this.isSerie = isSerie;
    }

    public String getDibujantePrincipal() {
        return dibujantePrincipal;
    }

    public void setDibujantePrincipal(String dibujantePrincipal) {
        this.dibujantePrincipal = dibujantePrincipal;
    }

    public boolean isIsColor() {
        return isColor;
    }

    public void setIsColor(boolean isColor) {
        this.isColor = isColor;
    }

    public int getNumEntregas() {
        return numEntregas;
    }

    public void setNumEntregas(int numEntregas) {
        this.numEntregas = numEntregas;
    }

    public boolean isIsSerie(){
        return isSerie;
    }

    public void setIsSerie(boolean isSerie){
        this.isSerie = isSerie;
    }




    @Override
    public double calcularPenalizacion(int diasRetraso){
        double penalizacion = 0;
        if(diasRetraso < 3){
            System.out.println("No hay penalizacion si tiene menos de 3 dias de retraso");
        } else {
            penalizacion = diasRetraso * 0.2;
        }
        return penalizacion;

    }

    @Override
    public String toString() {
        return "Comic [dibujantePrincipal=" + dibujantePrincipal + ", color=" + isColor + ", numEntregas=" + numEntregas
                + ", toString()=" + super.toString() + "]";
    }

    

  
    
}
