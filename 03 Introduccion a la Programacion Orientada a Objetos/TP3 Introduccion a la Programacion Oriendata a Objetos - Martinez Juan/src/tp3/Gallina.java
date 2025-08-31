/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Juan
 */
public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;
    
    public void mostrarEstado() {
        System.out.println("id gallina: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
        
    }
    
    public void envejecer() {
        edad++;
        System.out.println("Ahora tiene " + edad + " años");
    }
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("A puesto " + huevosPuestos + " huevos en total");
    }
    
    
}
