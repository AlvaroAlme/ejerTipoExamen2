
public class GestionBiblioteca {
    
    private Libro[] listadoLibro;

    public GestionBiblioteca(){
        super();
        listadoLibro = new Libro[150];
    }

    public Libro[] getListadoLibro(){
        return this.listadoLibro;
    }

    //Elimina el parametro persona que no estaba utilizando.
    public boolean registrarLibro(Libro libro, Persona persona) throws IllegalArgumentException{
        persona = null;
        for(int i = 0; i<listadoLibro.length; i++){
           if(libro.getISBN().equals(listadoLibro[i].getISBN())){
            throw new IllegalArgumentException("El ISBN introducido ya existe");
           } else if (listadoLibro[i] == null){
            listadoLibro[i] = libro;
            return true;
           }
        }
        return false;
       
    }

    public String informacionLibro(String isbn){
        for(int i = 0; i < listadoLibro.length && listadoLibro[i] != null; i++){
            if(!listadoLibro[i].getISBN().isBlank()){
                return listadoLibro[i].toString();
            } else {
                System.out.println("El libro no existe o esta vacio");
            }
        }
        return null;
    }

    public void listarLibros(){
        if(listadoLibro[0] == null){
            System.out.println("no existe ningun libro registrado");
        }
        for(int i = 0; i < listadoLibro.length; i++){
            System.out.println(listadoLibro[i].informacionComun());
        }    
        
    }
    
    public boolean prestarLibro(String isbn, Persona persona){
        //Si dentro de mi listado de libros, tengo un isbn que coincida con el que paso por teclado Y ADEMAS esta disponible
        for(int i = 0; i < listadoLibro.length && listadoLibro[i] != null; i++){
            if(listadoLibro[i].getISBN().matches(isbn) && listadoLibro[i].isDisponiblePrestamo()){
                listadoLibro[i].setPersonaPrestataria(persona);
                listadoLibro[i].setDisponiblePrestamo(false);
                return true;
            }
            }
        return false;
    }

    public double calcularPenalizacion(String isbn, int diasRetraso){
        for(int i = 0; i < listadoLibro.length && listadoLibro[i] != null; i++){
            if(listadoLibro[i].getISBN().equals(isbn)){
                return listadoLibro[i].calcularPenalizacion(diasRetraso);
            }
        }

        return -1;
    }

}
