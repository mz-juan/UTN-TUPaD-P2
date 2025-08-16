/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

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
        double num1;
        double num2;
        
        System.out.println("Ingrese un numero entero ");
        num1 = input.nextInt();
        
        System.out.println("Ingrese un segundo numero entero ");
        num2 = input.nextInt();
        
        double division = num1/num2;
        System.out.println("El resultado es " + division);
    }
    
}
