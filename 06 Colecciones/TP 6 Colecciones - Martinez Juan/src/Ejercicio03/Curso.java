/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio03;

/**
 *
 * @author Juan
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor p) {
        // Si ya tenía profesor, quitar este curso de su lista
        if (this.profesor != null) {
            Profesor anterior = this.profesor;
            this.profesor = null;
            anterior.getCursos().remove(this);
        }
        // Asignar nuevo profesor y sincronizar
        this.profesor = p;
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this);
        }
    }

    public void mostrarInfo() {
        String profName = (profesor == null) ? "Sin profesor" : profesor.getNombre();
        System.out.printf("Curso[codigo=%s, nombre=%s, profesor=%s]%n", codigo, nombre, profName);
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre;
    }

}
