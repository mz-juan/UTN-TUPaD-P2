/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio02;

/**
 *
 * @author Juan
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca("Biblioteca Central");

        // 2. Crear al menos tres autores
        Autor a1 = new Autor("A001", "Gabriel Garcia Marquez", "Colombia");
        Autor a2 = new Autor("A002", "Jorge Luis Borges", "Argentina");
        Autor a3 = new Autor("A003", "Isabel Allende", "Chile");

        // 3. Agregar 5 libros asociados a los autores
        b.agregarLibro("ISBN001", "Cien años de soledad", 1967, a1);
        b.agregarLibro("ISBN002", "El Aleph", 1949, a2);
        b.agregarLibro("ISBN003", "Ficciones", 1944, a2);
        b.agregarLibro("ISBN004", "La casa de los espiritus", 1982, a3);
        b.agregarLibro("ISBN005", "El coronel no tiene quien le escriba", 1961, a1);

        // 4. Listar todos los libros
        System.out.println("=== Listado de libros ===");
        b.listarLibros();

        // 5. Buscar por ISBN
        System.out.println("\n=== Buscar ISBN003 ===");
        Libro buscado = b.buscarLibroPorIsbn("ISBN003");
        if (buscado != null) buscado.mostrarInfo();

        // 6. Filtrar por año (ej: 1949)
        System.out.println("\n=== Filtrar por año ===");
        for (Libro l : b.filtrarLibrosPorAnio(1949)) l.mostrarInfo();

        // 7. Eliminar por ISBN y listar restantes
        System.out.println("\n=== Eliminar ISBN002 ===");
        b.eliminarLibro("ISBN002");
        b.listarLibros();

        // 8. Mostrar cantidad total de libros
        System.out.println("\nCantidad total de libros: " + b.obtenerCantidadLibros());

        // 9. Listar autores disponibles
        System.out.println("\n=== Autores disponibles ===");
        b.mostrarAutoresDisponibles();
    }   
    
}
