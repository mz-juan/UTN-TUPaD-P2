/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Parte02;

/**
 *
 * @author Juan
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Division 10/2 = " + ExcepcionesEjercicios.dividirSeguro(10, 2));
        System.out.println("Division 10/0 = " + ExcepcionesEjercicios.dividirSeguro(10, 0));

        System.out.println("Convertir 123 -> " + ExcepcionesEjercicios.convertirAInt("123"));
        System.out.println("Convertir abc -> " + ExcepcionesEjercicios.convertirAInt("abc"));

        ExcepcionesEjercicios.mostrarArchivo("archivo_de_prueba.txt");

        try {
            ExcepcionesEjercicios.validarEdad(25);
            ExcepcionesEjercicios.validarEdad(-5);
        } catch (EdadInvalidaException e) {
            System.out.println("Edad invalida capturada: " + e.getMessage());
        }
    }  
}
