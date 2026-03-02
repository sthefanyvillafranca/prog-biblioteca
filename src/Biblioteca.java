public class Biblioteca {
    /* Biblioteca --> gestionar libros */
    private Libro [] catalogo;
    private final int CANT_MAX_LIBROS;


    public Biblioteca(int cantidad_maxima_libros) {

        this.CANT_MAX_LIBROS = cantidad_maxima_libros;
        catalogo = new Libro[CANT_MAX_LIBROS];
    }

    /**
     * Busca el primer libro que encuentre con el id recibido
     * @param idLibro
     * @return libroEncontrado
     */
    public Libro findLibro(int idLibro){
        boolean seguirBuscando = true;
        Libro libroEncontrado = null;

        for(int i = 0; i < CANT_MAX_LIBROS && seguirBuscando; i++){
            if((catalogo[i] != null) && (catalogo[i].getId() == idLibro)){
                libroEncontrado = catalogo[i];
                seguirBuscando = false;
            }
        }
        return libroEncontrado;
    }

    /**
     * Metodo privado que busca primera posición libre en el cátalogo
     * @return -1 si no hay hueco libre, o la posición libre
     */
    private int buscarPrimerHuecoLibre(){
        int posicionLibre = -1;
        boolean seguirBuscando = true;

        for(int i = 0; i < CANT_MAX_LIBROS && seguirBuscando; i++){
            if(catalogo[i] == null){
                posicionLibre = i;
                seguirBuscando = false;
            }
        }
        return posicionLibre;
    }

    /**
     * Recibe y añade el libro no duplicado
     * @param libro Libro recibido
     * @return true si se ha añadido, false si no se ha podido añadir
     */
    public boolean addLibro(Libro libro){
        boolean libroAnadido = false;
        int posicion;

        // comprobamos si existe
            // buscar hueco
                // no hay -> libroAnadido = false
                // si hay ->
                    // añadimos
                    // libroAñadido = true
        if( findLibro(libro.getId()) == null){
            posicion = buscarPrimerHuecoLibre();
            if(posicion >= 0){
                catalogo[posicion] = libro;
                libroAnadido = true;

            }
        }
        return libroAnadido;
    }

    /**
     * Recibe un id de un libro, lo borra y devuelve el libro eliminado o null si no lo encuentra
     * @param id Identificador de libro
     * @return el libro eliminado o null en caso de no encontrarlo
     */
    public Libro deleteLibro(int id){
        Libro libroEncontrado = null;
        int posicion;
        boolean seguirBuscando = true;


        // comprobamos que existe. Necesitamos el libro y la posición.
        for(int i = 0; i < CANT_MAX_LIBROS && seguirBuscando; i++){
            if(catalogo[i] != null && catalogo[i].getId() == id){
                libroEncontrado = catalogo[i]; // guardo el libro
                catalogo[i] = null;
                seguirBuscando = false;
            }
        }
        return libroEncontrado;
    }

    /**
     * Actualiza el número de páginas del libro con el id recibido
     * @param idLibro id del libro a actualizar
     * @param numPags número de páginas actualizado
     * @return boolean  true si puede cambiarlo, false si no puede
     */
    public boolean updateNumPaginas(int idLibro, int numPags){
        boolean numPaginasUpdated = false;
        Libro libro;

        libro = findLibro(idLibro);

        if( libro != null){
           numPaginasUpdated = libro.updateNumPaginas(numPags);
        }

        return numPaginasUpdated;
    }

    /**
     * Devuelve un String con el catalogo de libros
     * @return String con el catalogo de libros
     */
    public String obtainCatalogo(){
        StringBuilder sb = new StringBuilder("Catalogo: { ");
        for (int i = 0; i < CANT_MAX_LIBROS; i++) {
            if(catalogo[i] != null){
                sb.append(catalogo[i].toString());
            }
        }
        sb.append("\n}");
        return sb.toString();
    }
}
