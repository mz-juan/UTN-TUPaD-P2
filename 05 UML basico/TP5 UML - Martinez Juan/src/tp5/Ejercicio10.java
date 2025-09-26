/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;
import java.util.Date;
/**
 *
 * @author Juan
 */
public class Ejercicio10 {
    public class CuentaBancaria{
        private int cbu;
        private double saldo;
        private Titular titular;
        private ClaveSeguridad claveSeguridad;
 
        public CuentaBancaria(int cbu, double saldo, Titular titular, ClaveSeguridad claveSeguridad) {
            this.cbu = cbu;
            this.saldo = saldo;
            this.titular = titular;
            this.claveSeguridad = claveSeguridad;
        }
    }


    public class Titular{
        private String nombre;
        private int dni;
 
        public Titular(String nombre, int dni) {
            this.nombre = nombre;
            this.dni = dni;
        }
    }
    public class ClaveSeguridad{
        private int codigo;
        private Date ultimaModificacion;
 
        public ClaveSeguridad(int codigo, Date ultimaModificacion) {
            this.codigo = codigo;
            this.ultimaModificacion = ultimaModificacion;
        }
    }
    
    
}
