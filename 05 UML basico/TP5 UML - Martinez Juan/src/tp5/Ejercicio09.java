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
public class Ejercicio09 {
    public class CitaMedica{
        private Date fecha, hora;
        private Profesional profesional;
        private Paciente paciente;
 
        public CitaMedica(Date fecha, Date hora, Profesional profesional, Paciente paciente) {
            this.fecha = fecha;
            this.hora = hora;
            this.profesional = profesional;
            this.paciente = paciente;
        }
    }

    public class Profesional{
        private String nombre, especialidad;
 
        public Profesional(String nombre, String especialidad) {
            this.nombre = nombre;
            this.especialidad = especialidad;
        }
    }

    public class Paciente{
        private String nombre, obraSocial;
 
        public Paciente(String nombre, String obraSocial) {
            this.nombre = nombre;
            this.obraSocial = obraSocial;
        }
    }

}
