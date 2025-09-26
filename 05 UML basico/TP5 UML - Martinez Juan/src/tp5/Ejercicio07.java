/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author Juan
 */
public class Ejercicio07 {
    public class Vehiculo{
        private String patente, modelo;
        private Conductor conductor;
        private Motor motor;

        public Vehiculo(String patente, String modelo, Conductor conductor, Motor motor) {
           this.patente = patente;
           this.modelo = modelo;
           this.conductor = conductor;
           this.motor = motor;
        }
    }

    public class Conductor{
        private String nombre, licencia;
        private Vehiculo vehiculo;
 
        public Conductor(String nombre, String licencia, Vehiculo vehiculo) {
            this.nombre = nombre;
            this.licencia = licencia;
            this.vehiculo = vehiculo;
        }
    }

    public class Motor{
        private int numeroSerie;
        private String tipo;

        public Motor(int numeroSerie, String tipo) {
            this.numeroSerie = numeroSerie;
            this.tipo = tipo;
        }
    }

}
