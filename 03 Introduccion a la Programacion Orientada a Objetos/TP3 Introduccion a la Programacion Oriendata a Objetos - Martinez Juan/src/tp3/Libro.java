/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Juan
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int anioPublicacion;
       
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getanioPublicacion() {
        return anioPublicacion;
    }
    public void setanioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0 && anioPublicacion <= 2025) { // validamos rango lógico
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Error: Año de publicación inválido (" + anioPublicacion + ").");
        }
    }
    
    
    public void mostrarDatos() {
        System.out.println(titulo + " " + autor + " " + anioPublicacion + " ");
    }
    
    
}
