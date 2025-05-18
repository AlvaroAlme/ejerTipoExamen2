package libro;


import java.util.Date;

import menu.Menu;


public class Comic extends Libro {

    private String dibujantePrincipal;
    private String color;
    private int numEntregas;

    public Comic(){
        super();
    }

    public Comic (String titulo, String nombreAutor, String apellidoAutor, String ISBN, Date anioPublicacion, String dibujantePrincipal, String color, int numEntregas){
        super(titulo, nombreAutor, apellidoAutor, ISBN, anioPublicacion );
        this.dibujantePrincipal = dibujantePrincipal;
        this.color = color;
        this.numEntregas = numEntregas;
    }

    public String getDibujantePrincipal() {
        return dibujantePrincipal;
    }

    public void setDibujantePrincipal(String dibujantePrincipal) {
        this.dibujantePrincipal = dibujantePrincipal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumEntregas() {
        return numEntregas;
    }

    public void setNumEntregas(int numEntregas) {
        this.numEntregas = numEntregas;
    }

    @Override
    public double calcularPenalizacion(){
        int diasRetraso = 0;
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
        return "Comic [dibujantePrincipal=" + dibujantePrincipal + ", color=" + color + ", numEntregas=" + numEntregas
                + ", toString()=" + super.toString() + "]";
    }

    

  
    
}
