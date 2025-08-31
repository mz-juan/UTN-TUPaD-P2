/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Juan
 */
public class NaveEspacial {
    String nombre;
    int combustible;
    final int COMBUSTIBLE_MAX = 100;
    
    public void mostarEstado(){
        System.out.println("Nombre: " + nombre);
        System.out.println("combustible: " + combustible + " de " + COMBUSTIBLE_MAX);
    }
    
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }
    
    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " avanzo " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " km.");
        }
    }
    
    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad de recarga debe ser positiva.");
            return;
        }
        if (combustible + cantidad > COMBUSTIBLE_MAX) {
            combustible = COMBUSTIBLE_MAX;
            System.out.println(nombre + " ha sido recargada al máximo (" + COMBUSTIBLE_MAX + ").");
        } else {
            combustible += cantidad;
            System.out.println(nombre + " ha recargado " + cantidad + " unidades. Combustible actual: " + combustible);
        }
    }
    
    
}
