/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

/**
 *
 * @author Juan
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro lib = new Libro();
        
        
        lib.mostrarDatos();
        
        lib.setanioPublicacion(2026);
        lib.mostrarDatos();
        
        lib.setanioPublicacion(1990);
        lib.mostrarDatos();
    }
    
}
