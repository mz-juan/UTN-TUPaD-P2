/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan
 */
public class Pedido implements Pagable {
    public enum Estado { NUEVO, PAGADO, ENVIADO, CANCELADO }

    private List<Producto> productos = new ArrayList<>();
    private Cliente cliente;
    private Estado estado = Estado.NUEVO;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public double calcularTotal() {
        return productos.stream().mapToDouble(Producto::calcularTotal).sum();
    }

    public void cambiarEstado(Estado nuevoEstado) {
        this.estado = nuevoEstado;
        // notificar al cliente del cambio de estado
        if (cliente != null) {
            cliente.notificar("El pedido cambio de estado a: " + nuevoEstado);
        }
    }

    public Estado getEstado() { return estado; }
    public Cliente getCliente() { return cliente; }
    public List<Producto> getProductos() { return productos; }
}
