/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp;

/**
 *
 * @author Juan
 */
public class TP7Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== Ejercicio01: Vehiculos ===");
        Auto miAuto = new Auto("Toyota", "Corolla", 4);
        miAuto.mostrarInfo();

        System.out.println("\n=== Ejercicio02: Figuras ===");
        Figura[] figuras = new Figura[] {
            new Circulo(2.5),
            new Rectangulo(3.0, 4.0)
        };
        for (Figura f : figuras) {
            f.mostrarArea(); 
        }

        System.out.println("\n=== Ejercicio03: Empleados ===");
        Empleado[] empleados = new Empleado[] {
            new EmpleadoPlanta("Ana", 75000.0),
            new EmpleadoTemporal("Luis", 500.0, 120)
        };
        for (Empleado e : empleados) {
            e.describir(); // 
            if (e instanceof EmpleadoTemporal) {
                EmpleadoTemporal et = (EmpleadoTemporal) e; 
                System.out.println("  (Temporal) Horas trabajadas: " + et.getHorasTrabajadas());
            } else if (e instanceof EmpleadoPlanta) {
                System.out.println("  (Planta) Contrato mensual fijo");
            }
        }

        System.out.println("\n=== Ejercicio04: Animales ===");
        Animal[] animales = new Animal[] {
            new Perro("Hachi"),
            new Gato("Pelusa"),
            new Vaca("Vaca")
        };
        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido(); //
        }
    }  
    
}
