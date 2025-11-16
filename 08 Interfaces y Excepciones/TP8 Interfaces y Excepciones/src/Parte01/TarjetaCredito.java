/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte01;

/**
 *
 * @author Juan
 */
public class TarjetaCredito implements PagoConDescuento {
    private String numero;
    private String titular;

    public TarjetaCredito(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    @Override
    public double aplicarDescuento(double monto) {
        // ejemplo: 2% de descuento por uso de tarjeta (puede cambiarse)
        return monto * 0.98;
    }

    @Override
    public boolean procesarPago(double monto) throws PagoException {
        double montoFinal = aplicarDescuento(monto);
        // simulación de validaciones
        if (montoFinal <= 0) throw new PagoException("Monto invalido para procesar con tarjeta.");
        System.out.println("Procesando pago con Tarjeta: " + montoFinal);
        return true;
    }
}

