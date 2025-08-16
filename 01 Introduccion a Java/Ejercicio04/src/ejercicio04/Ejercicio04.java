/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

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
        String nombre;
        int edad;
        
        System.out.println("Ingrese su nombre ");
        nombre = input.nextLine();
        
        System.out.println("Ingrese su edad ");
        edad = input.nextInt();
        
        System.out.println("Tu nombre es " + nombre);
        System.out.println("Tu edad es " + edad);

        
    }
    
}
