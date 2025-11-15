/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp;

/**
 *
 * @author Juan
 */
public class EmpleadoTemporal extends Empleado {
    private double horaCosto;
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, double horaCosto, int horasTrabajadas) {
        super(nombre);
        this.horaCosto = horaCosto;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return horaCosto * horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
}

