/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.odam1.ejemploherencia;

import java.util.ArrayList;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Perro extends Animal {
    private ArrayList<String> vacunas;
    private boolean desparasitado;
    
    //Constructor extendido de animal
    public Perro(String nombre, int edad, boolean desparasitado){
        super(nombre, edad);
        vacunas = new ArrayList<String>();
        this.desparasitado = desparasitado;
    }
    

    /**
     * @return the vacunas
     */
    public ArrayList<String> getVacunas() {
        return vacunas;
    }

    /**
     * @param vacunas the vacunas to set
     */
    public void setVacunas(ArrayList<String> vacunas) {
        this.vacunas = vacunas;
    }

    /**
     * @return the desparasitado
     */
    public boolean isDesparasitado() {
        return desparasitado;
    }

    /**
     * @param desparasitado the desparasitado to set
     */
    public void setDesparasitado(boolean desparasitado) {
        this.desparasitado = desparasitado;
    }
    
        @Override
    public void haceRuido(){
        super.haceRuido();
        System.out.println("GUAU GUAU");
    }
    
    public void traerPelota(){
        System.out.println("Voy a traerla pelota y vengo");
    }

    
}
