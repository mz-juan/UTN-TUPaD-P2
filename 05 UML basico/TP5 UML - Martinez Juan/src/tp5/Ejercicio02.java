/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author Juan
 */
public class Ejercicio02 {

    public class Celular{
        private int imei;
        private String marca;
        private String modelo;
        private Usuario usuario;
        private Bateria bateria;
 
        public Celular(int imei, String marca, String modelo, Usuario usuario, Bateria bateria) {
            this.imei = imei;
            this.marca = marca;
            this.modelo = modelo;
            this.usuario = usuario;
            this.bateria = bateria;
        }
    }

    public class Bateria{
        private String modelo;
        private String capacidad;
        
        public Bateria(String modelo, String capacidad) {
            this.modelo = modelo;
            this.capacidad = capacidad;
        }
    }    
    
    public class Usuario{
        private String nombre;
        private int dni;
        private Celular celular;
        
        public Usuario(String nombre, int dni, Celular celular) {
            this.nombre = nombre;
            this.dni = dni;
            this.celular = celular;
        }
    }
       
}
