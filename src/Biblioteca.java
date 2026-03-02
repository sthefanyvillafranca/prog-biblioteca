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
}
