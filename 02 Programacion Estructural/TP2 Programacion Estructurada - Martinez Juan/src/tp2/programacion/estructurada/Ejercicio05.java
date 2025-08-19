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
public class Ejercicio05 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int sumaPares = 0;
        
        while (true) {
            System.out.print("Ingrese numeros para contarlos (O ingrese 0 para finalizar): ");
            num = input.nextInt();
            if (num == 0) {
                break;
            }
            if (num % 2 == 0) {
                sumaPares += num;
            }
        }
        System.out.println("La suma total de los numeros pares es: " + sumaPares);
    }
    
}
