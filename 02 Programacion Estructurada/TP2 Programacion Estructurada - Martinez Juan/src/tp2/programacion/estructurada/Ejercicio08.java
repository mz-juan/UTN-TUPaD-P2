/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.programacion.estructurada;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = input.nextDouble();

        System.out.print("Ingrese el porcentaje de impuesto (%): ");
        double impuesto = input.nextDouble() / 100; // Convertimos a decimal

        System.out.print("Ingrese el porcentaje de descuento (%): ");
        double descuento = input.nextDouble() / 100; // Convertimos a decimal

        // Llamada al método
        double resultado = calcularPrecioFinal(precioBase, impuesto, descuento);
        // Salida
        System.out.println("El precio final es: $" + resultado);
        
    }
    
    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }
    
}
