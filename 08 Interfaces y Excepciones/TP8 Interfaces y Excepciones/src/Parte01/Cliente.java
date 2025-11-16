/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte01;

/**
 *
 * @author Juan
 */
public class Cliente implements Notificable {
    private String nombre;
    private String email; // ejemplo de dato adicional

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() { return nombre; }
    public String getEmail() { return email; }

    @Override
    public void notificar(String mensaje) {
        // implementación simple: mostrar por consola (en producción sería envío real)
        System.out.println("Notificacion a " + nombre + ": " + mensaje);
    }
}
