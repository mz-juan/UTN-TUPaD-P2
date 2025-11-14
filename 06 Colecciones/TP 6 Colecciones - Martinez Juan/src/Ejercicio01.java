/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        // 1. Crear y agregar al menos cinco productos
        Producto p1 = new Producto("P001", "Pan integral", 150.0, 30, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Auriculares BT", 2500.0, 12, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 1200.0, 25, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Cafetera", 4500.0, 5, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Queso", 800.0, 18, CategoriaProducto.ALIMENTOS);

        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3);
        inv.agregarProducto(p4);
        inv.agregarProducto(p5);

        // 2. Listar todos los productos
        System.out.println("=== Lista completa de productos ===");
        inv.listarProductos();

        // 3. Buscar por ID
        System.out.println("\n=== Buscar producto P002 ===");
        Producto buscado = inv.buscarProductoPorId("P002");
        if (buscado != null) buscado.mostrarInfo();

        // 4. Filtrar por categoria (ALIMENTOS)
        System.out.println("\n=== Filtrar por categoria ALIMENTOS ===");
        for (Producto p : inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS)) p.mostrarInfo();

        // 5. Eliminar un producto por ID y listar restantes
        System.out.println("\n=== Eliminar P004 y listar restantes ===");
        inv.eliminarProducto("P004");
        inv.listarProductos();

        // 6. Actualizar stock
        System.out.println("\n=== Actualizar stock de P003 a 40 ===");
        inv.actualizarStock("P003", 40);
        System.out.println(inv.buscarProductoPorId("P003"));

        // 7. Mostrar total de stock
        System.out.println("\nTotal de stock disponible: " + inv.obtenerTotalStock());

        // 8. Producto con mayor stock
        System.out.println("\nProducto con mayor stock:");
        Producto mayor = inv.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();

        // 9. Filtrar productos entre $1000 y $3000
        System.out.println("\n=== Productos con precio entre $1000 y $3000 ===");
        for (Producto p : inv.filtrarProductosPorPrecio(1000.0, 3000.0)) p.mostrarInfo();

        // 10. Mostrar categorias disponibles con descripcion
        System.out.println("\n=== Categorias disponibles ===");
        inv.mostrarCategoriasDisponibles();

    }
    
}
