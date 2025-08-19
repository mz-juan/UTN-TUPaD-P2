/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.programacion.estructurada;

/**
 *
 * @author Juan
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] precios = {2.6,37,87,684,100,04};
        
        System.out.println("Precios originales: ");
        mostrarPrecios(precios, 0);
        
        precios[0] = 3;
        precios[5] = 172.9;
        System.out.println("Precios modificados: ");
        mostrarPreciosModificados(precios, 0);
        
    }
    static void mostrarPrecios(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            mostrarPrecios(precios, indice + 1);
        }
    }
    static void mostrarPreciosModificados(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            mostrarPreciosModificados(precios, indice + 1);
        }
    }
}
