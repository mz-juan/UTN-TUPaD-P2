/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

/**
 *
 * @author Juan
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota Masc = new Mascota();
        
        Masc.nombre = "Hachi";
        Masc.especie = "Shiba Inu";
        Masc.edad = 3;
        
        Masc.mostrarInfo();
        Masc.cumplirAnios();
        
        System.out.println("Datos actualizados: ");
        Masc.mostrarInfo();
    }
    
}
