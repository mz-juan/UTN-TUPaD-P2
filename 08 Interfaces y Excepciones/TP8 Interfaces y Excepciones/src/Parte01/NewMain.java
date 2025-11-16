/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Parte01;

/**
 *
 * @author Juan
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // --- Parte Interfaces / E-commerce ---
        Cliente cliente = new Cliente("Juan Perez", "juan@example.com");
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(new Producto("Libro", 1200.0));
        pedido.agregarProducto(new Producto("Mouse", 350.0));

        System.out.println("Total pedido: $" + pedido.calcularTotal());
        pedido.cambiarEstado(Pedido.Estado.PAGADO);

        // probar pagos
        TarjetaCredito tarjeta = new TarjetaCredito("1111-2222-3333-4444", "Juan Perez");
        Paypal paypal = new Paypal("juan@paypal");

        try {
            double total = pedido.calcularTotal();
            tarjeta.procesarPago(total);
            pedido.cambiarEstado(Pedido.Estado.ENVIADO);
        } catch (PagoException e) {
            System.out.println("Fallo en el pago: " + e.getMessage());
        }


    }
    
}
