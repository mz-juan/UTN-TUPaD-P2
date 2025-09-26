/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author Juan
 */
public class Ejercicio05 {
    public class Computadora{
        private String marca;
        private int numSerie;
        private Propietario propietario;
        private PlacaMadre placaMadre;
 
        public Computadora(String marca, int numSerie, Propietario propietario, PlacaMadre placaMadre) {
            this.marca = marca;
            this.numSerie = numSerie;
            this.propietario = propietario;
            this.placaMadre = placaMadre;
        }
    }

    public class Propietario{
        private String nombre;
        private int dni;
        private Computadora computadora;
 
        public Propietario(String nombre, int dni, Computadora computadora) {
            this.nombre = nombre;
            this.dni = dni;
            this.computadora = computadora;
        }
    }

    public class PlacaMadre{
        private String modelo, chipset;
 
        public PlacaMadre(String modelo, String chipset) {
            this.modelo = modelo;
            this.chipset = chipset;
        }
    }

}
