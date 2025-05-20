import menu.Menu;

public class Main {
    
    public static void main(String [] args){

        GestionBiblioteca gestionBiblioteca = new GestionBiblioteca();

        int opcion = 0;
        while(opcion != 6){
            String[] opciones = {"Registrar un libro", "Buscar un libro", "Listar todos los libros", "Prestar un libro", "Calculzar penalzacion por retraso", "Salir"};
            opcion = Menu.preguntarOpcion(opciones);

            switch(opcion){
                case 1:
                    registrarLibro(gestionBiblioteca);
                break;
                case 2:
                    buscarLibro(gestionBiblioteca);
                break;
                case 3:
                    listadoLibros(gestionBiblioteca);
                break;
                case 4:
                    prestarLibro(gestionBiblioteca);
                break;
                case 5:
                    calcularPenalizacion(gestionBiblioteca);
                break;
                case 6:
                    System.out.println("Hasta otra!");
                break;
            }
        }
    }

    public static void registrarLibro(GestionBiblioteca gestionBiblioteca){
        String tituloLibro = Menu.preguntarTexto("Introduce el titulod el libro: ");
        String nombreAutor = Menu.preguntarTexto("Introduce el nombre del autor: ");
        String apellidosAutor = Menu.preguntarTexto("Introduce el apellido del autor: ");
        String ISBN = Menu.preguntarTexto("Introduce el ISBN del libro: ");
        int anioPublicacion = Menu.preguntarEntero("Introduce el año de publicacion: ");

        Persona persona = null;
        Libro libro = null;

        int tipoLibro = Menu.preguntarOpcion(new String[]{"Comic", "Novela", "Libro de texto"});

        switch(tipoLibro){
            case 1:
                Comic comic = new Comic();
                String dibujantePrincipal = Menu.preguntarTexto("Introduce el nombre del dibujante principal: ");
                boolean esColor = Menu.preguntaBoolean("¿Es un comic a color?: ");
                boolean isSerie = Menu.preguntaBoolean("¿Es una serie? ");
                if(isSerie){
                    int numEntregas = Menu.preguntarEntero("¿Cuantas entragas tiene?: ");
                    comic.setNumEntregas(numEntregas);
                }

                
                comic.setTitulo(tituloLibro);
                comic.setNombreAutor(nombreAutor);
                comic.setApellidoAutor(apellidosAutor);
                comic.setISBN(ISBN);
                comic.setAnioPublicacion(anioPublicacion);
                comic.setDibujantePrincipal(dibujantePrincipal);
                comic.setIsColor(esColor);
                comic.setIsSerie(isSerie);
                

                libro = comic;

            break;
            case 2:
                String genero = Menu.preguntarTexto("Introduce el genero literario: ");
                int numPaginas = Menu.preguntarEntero("Introduce el numero de paginas: ");
                boolean tieneVersionDigital = Menu.preguntaBoolean("Indica si tiene version digital: ");

                Novela novela = new Novela();
                novela.setTitulo(tituloLibro);
                novela.setNombreAutor(nombreAutor);
                novela.setApellidoAutor(apellidosAutor);
                novela.setISBN(ISBN);
                novela.setAnioPublicacion(anioPublicacion);
                novela.setGenero(genero);
                novela.setNumPaginas(numPaginas);
                novela.setVersionDigital(tieneVersionDigital);

                libro = novela;

            break;
            case 3:
                String curso = Menu.preguntarTexto("Introduce el curso al que va dirigido: ");
                String asignatura = Menu.preguntarTexto("Introduce la asignatura: ");
                int precio = Menu.preguntarEntero("Introduce el precio del libro: ");

                LibroDeTexto libroTexto = new LibroDeTexto();
                libroTexto.setTitulo(tituloLibro);
                libroTexto.setNombreAutor(nombreAutor);
                libroTexto.setApellidoAutor(apellidosAutor);
                libroTexto.setISBN(ISBN);
                libroTexto.setAnioPublicacion(anioPublicacion);
                libroTexto.setCurso(curso);
                libroTexto.setAsignatura(asignatura);
                libroTexto.setPrecio(precio);

                libro = libroTexto;
            break;
        }
        gestionBiblioteca.registrarLibro(libro, persona);
    }

    public static void buscarLibro(GestionBiblioteca gestionBiblioteca){
        String isbn = Menu.preguntarTexto("Introduce un ISBN valido");
        String infoLibro = gestionBiblioteca.informacionLibro(isbn);

        if(infoLibro != null){
            System.out.println(infoLibro);
        } else {
            System.out.println("No se ha encontrado ningun libro que coincida con el ISBN");
        }
    }

    public static void listadoLibros(GestionBiblioteca gestionBiblioteca){
        System.out.println("Este es el listado de liberos: ");
        gestionBiblioteca.listarLibros();
    }

    public static void prestarLibro(GestionBiblioteca gestionBiblioteca){
        String nombre = Menu.preguntarTexto("Introduce el nombre de la persona que recibe el libro: ");
        String apellido = Menu.preguntarTexto("Introduce el apellido de la persona que recibe el libro: ");
        String dni = Menu.preguntarDNI("Introduce el dni: ");
        int fechaNacimiento = Menu.preguntarEntero("Introduce la fecha de Nacimiento: ");

        String isbn = Menu.preguntarTexto("Introduce el ISBN del libro que quiere coger: ");

        Persona prestamista = new Persona(nombre, apellido, dni, fechaNacimiento);

        boolean libroPrestado = gestionBiblioteca.prestarLibro(isbn, prestamista);
        if(libroPrestado){
            System.out.println("Libro prestado correctamente");
        } else {
            System.out.println("No se pudo prestar el libro.");
        }

    }

    public static void calcularPenalizacion(GestionBiblioteca gestionBiblioteca){
        int diasRetraso = Menu.preguntarEntero("Introduce el numero de dias de retraso: ");
        String isbn = Menu.preguntarTexto("Introduce el ISBN del libro: ");
        double penalizacion = gestionBiblioteca.calcularPenalizacion(isbn, diasRetraso);

        System.out.println("El coste de la penalizacion es de: " + penalizacion);
    }




}
