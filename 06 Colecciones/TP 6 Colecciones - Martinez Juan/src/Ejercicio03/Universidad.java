/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio03;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan
 */
public class Universidad {
    private String nombre;
    private final List<Profesor> profesores = new ArrayList<>();
    private final List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProfesor(Profesor p) {
        if (buscarProfesorPorId(p.getId()) == null) profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        if (buscarCursoPorCodigo(c.getCodigo()) == null) cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        return profesores.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        return cursos.stream().filter(c -> c.getCodigo().equals(codigo)).findFirst().orElse(null);
    }

    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c == null || p == null) return false;
        c.setProfesor(p);
        return true;
    }

    public void listarProfesores() {
        for (Profesor p : profesores) {
            p.mostrarInfo();
            p.listarCursos();
        }
    }

    public void listarCursos() {
        for (Curso c : cursos) c.mostrarInfo();
    }

    public boolean eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            if (c.getProfesor() != null) {
                c.setProfesor(null); // rompe la relación
            }
            cursos.remove(c);
            return true;
        }
        return false;
    }

    public boolean eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            // Dejar null en cursos que dictaba
            for (Curso c : new ArrayList<>(p.getCursos())) {
                c.setProfesor(null);
            }
            profesores.remove(p);
            return true;
        }
        return false;
    }

    public void reporteCantidadCursosPorProfesor() {
        System.out.println("=== Cantidad de cursos por profesor ===");
        for (Profesor p : profesores) {
            System.out.printf("%s : %d%n", p.getNombre(), p.getCursos().size());
        }
    }

}
