/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploProcesos;

/**
 *
 * @author sebastian.eduardo.va
 */
public abstract class Proceso {
    protected String nombre;

    public Proceso(String nombre) {
        this.nombre = nombre;
    }

    // Código común
    public void ejecutar() {
        System.out.println("Iniciando proceso: " + nombre);
        validar();
        procesar();
        System.out.println("Proceso finalizado");
    }

    // Pasos obligatorios
    protected abstract void validar();

    protected abstract void procesar();

    //Paso común
    protected void enviarNotificacion() {
        System.out.println("Enviando mail de finalización de proceso...");
    }
}
