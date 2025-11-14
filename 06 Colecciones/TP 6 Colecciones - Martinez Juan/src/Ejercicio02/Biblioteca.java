/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Juan
 */
public class Biblioteca {
    private String nombre;
    private final List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro l = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(l);
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        for (Libro l : libros) l.mostrarInfo();
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) return l;
        }
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        Libro l = buscarLibroPorIsbn(isbn);
        if (l != null) {
            libros.remove(l);
            return true;
        }
        return false;
    }

    public int obtenerCantidadLibros() { return libros.size(); }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        return libros.stream().filter(l -> l.getAnioPublicacion() == anio).collect(Collectors.toList());
    }

    public void mostrarAutoresDisponibles() {
        List<Autor> autores = libros.stream()
                .map(Libro::getAutor)
                .distinct()
                .collect(Collectors.toList());
        for (Autor a : autores) a.mostrarInfo();
    }

}
