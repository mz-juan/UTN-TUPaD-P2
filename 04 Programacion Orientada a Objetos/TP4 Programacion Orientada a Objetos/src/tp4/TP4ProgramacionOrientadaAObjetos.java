/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

/**
 *
 * @author Juan
 */
public class TP4ProgramacionOrientadaAObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado(1, "Ana Lopez", "Desarrolladora", 80000);
        Empleado e2 = new Empleado(2, "Juan Martinez", "Diseñador", 70000);
        Empleado e3 = new Empleado("Maria Rivero", "Tester");
        Empleado e4 = new Empleado("Nahuel Aranda", "Soporte");

        // aumentos de salario
        e1.actualizarSalario(10);
        e2.actualizarSalario(5000);
        e3.actualizarSalario(15);

        // mostrar información
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());

        // mostrar el total de empleados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
