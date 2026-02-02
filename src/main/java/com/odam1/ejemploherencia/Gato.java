/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.odam1.ejemploherencia;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Gato extends Animal {
    private int numVidas;
    
    public Gato(){
        super();
        this.numVidas = 7;
    }

    /**
     * @return the numVidas
     */
    public int getNumVidas() {
        return numVidas;
    }

    /**
     * @param numVidas the numVidas to set
     */
    public void setNumVidas(int numVidas) {
        this.numVidas = numVidas;
    }
    
    @Override
    public void haceRuido(){
        super.haceRuido();
        System.out.println("MIAUUU");
    }
    
    public void esconderse(){
        System.out.println("Aqui no me encontrarán...");
    }
}
