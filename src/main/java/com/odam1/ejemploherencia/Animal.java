/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.odam1.ejemploherencia;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Animal {
    protected String nombre;
    protected int edad;
    
    //constructor
    public Animal(){
    
    }
    
    public Animal(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    public void haceRuido(){
        System.out.println("Voy a hacer un ruido...");
       
    }
    
    public void dormir(){
        System.out.println("zzzzZZZZZZ");
    }
    
}
