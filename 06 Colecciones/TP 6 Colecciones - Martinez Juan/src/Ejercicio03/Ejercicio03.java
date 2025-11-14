/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio03;

/**
 *
 * @author Juan
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Universidad u = new Universidad("Universidad Nacional Ejemplo");

        // 1. Crear al menos 3 profesores y 5 cursos
        Profesor prof1 = new Profesor("PR1", "Ana Lopez", "Matematicas");
        Profesor prof2 = new Profesor("PR2", "Diego Ruben", "Programacion");
        Profesor prof3 = new Profesor("PR3", "Maria Mendez", "Fisica");

        Curso c1 = new Curso("C001", "Algebra");
        Curso c2 = new Curso("C002", "Programacion I");
        Curso c3 = new Curso("C003", "Fisica I");
        Curso c4 = new Curso("C004", "Estructuras de Datos");
        Curso c5 = new Curso("C005", "Calculo");

        // 2. Agregar profesores y cursos a la universidad
        u.agregarProfesor(prof1);
        u.agregarProfesor(prof2);
        u.agregarProfesor(prof3);

        u.agregarCurso(c1);
        u.agregarCurso(c2);
        u.agregarCurso(c3);
        u.agregarCurso(c4);
        u.agregarCurso(c5);

        // 3. Asignar profesores a cursos
        u.asignarProfesorACurso("C001", "PR1");
        u.asignarProfesorACurso("C002", "PR2");
        u.asignarProfesorACurso("C004", "PR2");
        u.asignarProfesorACurso("C003", "PR3");

        // 4. Listar cursos con su profesor y profesores con sus cursos
        System.out.println("=== Cursos ===");
        u.listarCursos();
        System.out.println("\n=== Profesores ===");
        u.listarProfesores();

        // 5. Cambiar el profesor de un curso y verificar sincronización
        System.out.println("\n=== Reasignar profesor de C004 a PR3 ===");
        u.asignarProfesorACurso("C004", "PR3");
        u.listarCursos();
        System.out.println();
        u.listarProfesores();

        // 6. Remover un curso y confirmar que ya no aparece en la lista del profesor
        System.out.println("\n=== Eliminar curso C003 ===");
        u.eliminarCurso("C003");
        u.listarCursos();
        System.out.println();
        u.listarProfesores();

        // 7. Remover un profesor y dejar profesor = null en sus cursos
        System.out.println("\n=== Eliminar profesor PR2 ===");
        u.eliminarProfesor("PR2");
        u.listarProfesores();
        System.out.println("\nCursos despues de eliminar PR2:");
        u.listarCursos();

        // 8. Reporte: cantidad de cursos por profesor
        System.out.println();
        u.reporteCantidadCursosPorProfesor();
    }   
    
}
