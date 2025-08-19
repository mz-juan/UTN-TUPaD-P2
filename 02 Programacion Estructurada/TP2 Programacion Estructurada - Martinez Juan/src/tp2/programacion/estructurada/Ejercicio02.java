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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numMayor;
        
        System.out.println("Ingre un primer numero: ");
        int num1 = input.nextInt();
        System.out.println("Ingre un segundo numero: ");
        int num2 = input.nextInt();
        System.out.println("Ingre un tercer numero: ");
        int num3 = input.nextInt();
        
        if (num1 >= num2 && num1 >= num3) {
            numMayor = num1;
        } else if (num2 >= num1 && num2 >= num3){
            numMayor = num2;        
        } else {
            numMayor = num3;
        }
        System.out.println("El numero mayor entre " + num1 +", " + num2 + " y " + num3 + " es: " +numMayor);
    }
    
}
