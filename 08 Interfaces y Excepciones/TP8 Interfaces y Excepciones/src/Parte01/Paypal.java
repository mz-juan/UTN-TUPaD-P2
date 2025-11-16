/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte01;

/**
 *
 * @author Juan
 */
public class Paypal implements Pago {
    private String cuentaEmail;

    public Paypal(String cuentaEmail) {
        this.cuentaEmail = cuentaEmail;
    }

    @Override
    public boolean procesarPago(double monto) throws PagoException {
        if (monto <= 0) throw new PagoException("Monto invalido para procesar con PayPal.");
        // sin descuento en este ejemplo
        System.out.println("Procesando pago con PayPal: " + monto);
        return true;
    }
}

