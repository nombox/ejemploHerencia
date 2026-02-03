/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorefactorizarcodigo;

/**
 *
 * @author sebastian.eduardo.va
 */
public abstract class Figura {
    protected String nombre;
    
    //CONSTRUCTOR
    public Figura(String nombre){
        this.nombre = nombre;
    }
    
    public abstract double area();

    public abstract double perimetro();
    
    @Override
    public String toString(){
    return "Figura: " + this.nombre + 
           "\n Area: " + this.area() + 
           "\n Perimetro: " + this.perimetro() + 
           "\n----------------------";
    }
}
