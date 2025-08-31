/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Juan
 */
public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
    
    void cumplirAnios() {
        edad++;
        System.out.println("La nueva edad es de: " + edad);
    }
}
