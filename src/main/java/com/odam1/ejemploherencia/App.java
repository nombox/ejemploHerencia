/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.odam1.ejemploherencia;

/**
 *
 * @author sebastian.eduardo.va
 */
public class App {

    public static void main(String[] args) {
        Animal animal1 = new Animal("Pájaro", 2);
        Perro perro = new Perro("Spike", 8, true);
        Gato gato = new Gato();
        
        animal1.haceRuido();
        animal1.dormir();
        
        perro.haceRuido();
        perro.traerPelota();
        
        gato.haceRuido();
        gato.esconderse();
        
        
    }
}
