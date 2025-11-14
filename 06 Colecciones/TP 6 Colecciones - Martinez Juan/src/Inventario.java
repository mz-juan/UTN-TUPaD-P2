/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author Juan
 */
public class Inventario {
    private final List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        // Evitar duplicados por id
        if (buscarProductoPorId(p.getId()) == null) {
            productos.add(p);
        } else {
            System.out.println("Ya existe un producto con id " + p.getId());
        }
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    public boolean eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            return true;
        }
        return false;
    }

    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }

    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        return productos.stream()
                .filter(p -> p.getCategoria() == categoria)
                .collect(Collectors.toList());
    }

    public int obtenerTotalStock() {
        return productos.stream().mapToInt(Producto::getCantidad).sum();
    }

    public Producto obtenerProductoConMayorStock() {
        Optional<Producto> opt = productos.stream()
                .max(Comparator.comparingInt(Producto::getCantidad));
        return opt.orElse(null);
    }

    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        return productos.stream()
                .filter(p -> p.getPrecio() >= min && p.getPrecio() <= max)
                .collect(Collectors.toList());
    }

    public void mostrarCategoriasDisponibles() {
        // Mostrar descripciones desde el enum
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.printf("%s - %s%n", c, c.getDescripcion());
        }
    }

}
