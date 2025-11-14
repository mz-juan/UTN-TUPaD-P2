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
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private final List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public List<Curso> getCursos() { return cursos; }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }

    public void eliminarCurso(Curso c) {
        if (cursos.remove(c)) {
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println(nombre + " no dicta cursos actualmente.");
            return;
        }
        System.out.println("Cursos de " + nombre + ":");
        for (Curso c : cursos) {
            System.out.printf("- %s : %s%n", c.getCodigo(), c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.printf("Profesor[id=%s, nombre=%s, especialidad=%s, cantidadCursos=%d]%n",
                id, nombre, especialidad, cursos.size());
    }

    @Override
    public String toString() {
        return nombre + " (" + especialidad + ")";
    }

}
