/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorefactorizarcodigo;

/**
 *
 * @author laura
 */
public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        super("Cuadrado");
        this.lado = lado;
    }
    
    @Override
    public double area() {
        return lado * lado;
    }
    
    @Override
    public double perimetro() {
        return 4 * lado;
    }
    
    public double getLado() {
        return lado;
    }
    
    public void setLado(double lado){
        this.lado = lado;
    }
}
