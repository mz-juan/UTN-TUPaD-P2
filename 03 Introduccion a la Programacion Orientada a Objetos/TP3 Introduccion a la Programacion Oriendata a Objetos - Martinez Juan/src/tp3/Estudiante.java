/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Juan
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    void mostrarInfor() {
        System.out.println(nombre +" " + apellido + " " + curso + " "+ calificacion);
    }
    
    void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("Nueva claificacion: " + calificacion);
    }
    
    void bajarCalificaciones(double puntos) {
        calificacion -= puntos;
        System.out.println("Nueva calificacion: " + calificacion);
    }
}
