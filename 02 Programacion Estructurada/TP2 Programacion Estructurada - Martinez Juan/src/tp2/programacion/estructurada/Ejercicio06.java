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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int nNegativos = 0;
        int nPositivos = 0;
        int ceros = 0;
        
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("ingrese un numero " + i + ": ");
            num = input.nextInt();
        
            if (num < 0) {
                nNegativos++;
            } else if (num > 0) {
                nPositivos++;
            } else {
                ceros++;
            }
        }
        System.out.println("Resultados: ");
        System.out.println("Positivos: " + nPositivos);
        System.out.println("Negativos: " + nNegativos);
        System.out.println("Ceros: " + ceros);
    }
    
}
