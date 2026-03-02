public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(10);
        Libro libro1 = new Libro(1,"El quijote", "Miguelito", 900);
        Libro libro2 = new Libro(2,"El principito", "Frances", 100);

        System.out.print(biblioteca.findLibro(1)); //
        System.out.print(biblioteca.addLibro(libro1)); //
        System.out.print(biblioteca.addLibro(libro2)); //

        System.out.print(biblioteca.obtainCatalogo());


    }
}

/**
 *
 * Biblioteca --> gestionar libros
 * Libro --> id, titulo, autor, num pag.
 *
 * CRUD - create , read, update delete
 * addLibro
 * deleteLibro
 * updateNumPags
 * findLibro
 * deleteLibro
 *
 * obtainCatalogo (todos los libros que tenemos)
 *
 * ¿Cómo se guardaran los libros? Un array.
 * Libro [] catalogo = new Libro [longitud]
 *
 */


/**
 * Recordar que al publicar el repositorio en github por primera vez, poner chore: estructura o algo asi
 */