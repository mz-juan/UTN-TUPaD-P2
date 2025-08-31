/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

/**
 *
 * @author Juan
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        
        nave.nombre = "Nodrisa";
        nave.combustible = 50;
        nave.mostarEstado();
        System.out.println(" ");
        
        nave.avanzar(30);
        nave.recargarCombustible(60);
        nave.despegar();
        nave.avanzar(20);
        
        nave.mostarEstado();
    }
    
}
