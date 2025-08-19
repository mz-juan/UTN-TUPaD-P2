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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioDescontado;
        
        System.out.println("Ingrese el precio del producto: ");
        double precioProducto = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese una categoria (A, B, C): ");
        char categoria = input.next().toUpperCase().charAt(0);
        
        
        
        System.out.println("La categia que eligio es: " + categoria);
        System.out.println("el precio ingresado es: " + precioProducto);
        
        
        switch (categoria) {
            case 'A':
                precioDescontado = (precioProducto*0.10);
                System.out.println("El precio con descuento aplicado (10%) es de: " + (precioProducto - precioDescontado));
                break;
            case 'B':
                precioDescontado = (precioProducto*0.15);
                System.out.println("El precio con descuento aplicado (15%) es de: " + (precioProducto - precioDescontado));
                break;
            case 'C':
                precioDescontado = (precioProducto*0.20);
                System.out.println("El precio con descuento aplicado (20%) es de: " + (precioProducto - precioDescontado));
                break;
            default:
                System.out.println("Operacion invalida");
        }
    }
    
}
