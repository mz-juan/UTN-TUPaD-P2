/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;
import java.util.Date;
import java.util.HashSet;
/**
 *
 * @author Juan
 */
public class Ejercicio08 {
    public class Documento{
        private String titulo, contenido;
        private FirmaDigital firmaDigital;
 
        public Documento(String titulo, String contenido, FirmaDigital firmaDigital) {
            this.titulo = titulo;
            this.contenido = contenido;
            this.firmaDigital = firmaDigital;
        }
    }

    public class FirmaDigital{
        private HashSet codigoHash;
        private Date fecha;
        private Usuario usuario;
 
        public FirmaDigital(HashSet codigoHash, Date fecha, Usuario usuario) {
            this.codigoHash = codigoHash;
            this.fecha = fecha;
            this.usuario = usuario;
        }
    }

    public class Usuario{
        private String nombre, email;
        private FirmaDigital firmaDigital;
 
        public Usuario(String nombre, String email, FirmaDigital firmaDigital) {
            this.nombre = nombre;
            this.email = email;
            this.firmaDigital = firmaDigital;
        }
    }

}
