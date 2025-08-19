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
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto: ");
        double precioProducto = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el peso el paquete en kg: ");
        double peso = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese la zona de envio (Nacional o Internacional)");
        String zona = input.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.println("El costo del envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
        
    }
    static double calcularCostoEnvio(double peso, String zona) {
        double costoEnvio = 0;

        if (zona.equalsIgnoreCase("Nacional")) {
            costoEnvio = peso * 5; // $5 por kg
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoEnvio = peso * 10; // $10 por kg
        } else {
            System.out.println("Zona inválida. Se asume costo de envío 0.");
        }
        return costoEnvio;
    }
    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
