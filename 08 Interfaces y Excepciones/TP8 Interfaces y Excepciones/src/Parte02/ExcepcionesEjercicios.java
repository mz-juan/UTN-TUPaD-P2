/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte02;

import java.io.*;
/**
 *
 * @author Juan
 */
public class ExcepcionesEjercicios {
    // Ejercicio 1: Division segura
    public static double dividirSeguro(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: division por cero.");
            return Double.NaN;
        }
    }

    // Ejercicio 2: Conversion de cadena a numero
    public static Integer convertirAInt(String texto) {
        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            System.out.println("Error: formato de numero invalido.");
            return null;
        }
    }

    // Ejercicio 3 y 5: Lectura de archivo con try-with-resources
    public static void mostrarArchivo(String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: archivo no encontrado: " + ruta);
        } catch (IOException e) {
            System.out.println("Error de E/S al leer el archivo: " + e.getMessage());
        }
    }

    // Ejercicio 4: Validar edad y lanzar excepcion personalizada
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad fuera de rango: " + edad);
        }
        System.out.println("Edad valida: " + edad);
    }

}
