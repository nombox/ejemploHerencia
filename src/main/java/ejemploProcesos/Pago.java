/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploProcesos;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Pago extends Proceso {
        public Pago(String nombre) {
        super(nombre);
    }

    @Override
    protected void validar() {
        System.out.println("Validando datos del pago...");
    }

    @Override
    protected void procesar() {
        System.out.println("Procesando el pago...");
    }
}
