/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

/**
 *
 * @author Juan
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante est = new Estudiante();
        
        System.out.println("Datos ingresados del estudiante: ");
        est.nombre = "Juan";
        est.apellido = "Martinez";
        est.curso = "Programacion";
        est.calificacion = 6;
        
        
        est.mostrarInfor();
        
        est.subirCalificacion(2);
        
        est.bajarCalificaciones(4);
        
    
    }
    
}
