/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.programacion.estructurada;

/**
 *
 * @author Juan
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] precios = {2.6,37,87,684,100,04};
        
        System.out.println("Precios originales: ");
        for (int i = 0; i < precios.length; i++) {
            double mostrarPrecios = precios[i];
            System.out.println("Precio: $" + mostrarPrecios);
        }
        System.out.println("Precios modificados: ");
        precios[0] = 3;
        precios[5] = 172.9;
        for (int i = 0; i < precios.length; i++) {
            double mostrarPrecios = precios[i];
            System.out.println("Precio: $" + mostrarPrecios);
        }
        
    }
    
}
