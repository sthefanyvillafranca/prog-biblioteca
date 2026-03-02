public class Libro {
   /* Libro --> id, titulo, autor, num pag. */

    /*ATRIBUTOS de la CLASE*/
    private int id;
    private String titulo;
    private String autor;
    private int numPaginas;

    /**
     * Metodo constructor
     * @param id identificador del libro
     * @param titulo titulo del libro
     * @param autor nombre del autor
     * @param numPaginas número de paginas
     */
    public Libro(int id, String titulo, String autor, int numPaginas) {
        /* PARAMETROS del metodo */

        int numHojas; // variable del metodo

        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;

        numHojas = numPaginas/2;

    }

    /**
     * Devuelve el id del libro
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Devuelve el titulo del libro
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Devuelve el autor
     * @return autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Devuelve número de paginas
     * @return numPaginas
     */
    public int getNumPaginas() {
        return numPaginas;
    }

    // recordar siempre debe estar el Override.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Libro: {");
        sb.append(String.format("\n id: %d;", id));
        sb.append(String.format(" titulo: %s;", titulo));
        sb.append(String.format(" autor: %s;", autor));
        sb.append(String.format(" num. páginas: %d;", numPaginas));
        sb.append("}");

        return sb.toString();
    }

    /**
     * Actualiza el número de páginas que tiene el libro. Comprueba que el número recibido sea mayor que 0
     * @param numPags nueva cantidad de páginas
     * @return true si ha podido cambiarse, false si no ha podido cambiarse
     */
    public boolean updateNumPaginas(int numPags) {
        boolean resultado;

        if( numPags <= 0){
            resultado = false;
        } else {
            this.numPaginas = numPags;
            resultado = true;
        }
        return resultado;
    }
}
