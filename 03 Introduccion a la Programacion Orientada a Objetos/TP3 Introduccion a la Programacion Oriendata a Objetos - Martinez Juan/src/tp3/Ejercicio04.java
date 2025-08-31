/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

/**
 *
 * @author Juan
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gallina g1 = new Gallina();
        
        g1.idGallina = 123;
        g1.edad = 3;
        g1.huevosPuestos = 4;
        
        System.out.println("Estado: Primer gallina");
        g1.mostrarEstado();
        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();
        System.out.println("Estado actualizado g1");
        g1.mostrarEstado();
        System.out.println("");
        
        Gallina g2 = new Gallina();
        g2.idGallina = 321;
        g2.edad = 2;
        g2.huevosPuestos = 10;
        
        System.out.println("Estado: Segunda gallina");
        g2.mostrarEstado();
        g2.envejecer();
        g2.envejecer();
        g2.ponerHuevo();
        System.out.println("Estado actualizado g2");
    }
    
}
