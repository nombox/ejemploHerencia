/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorefactorizarcodigo;

/**
 *
 * @author laura
 */
public class TrianguloEquilatero extends Figura {
    private double lado;

    public TrianguloEquilatero( double lado) {
        super("Triangulo Equilatero");
        this.lado = lado;
    }
    
    @Override
    public double area() {
        return (Math.sqrt(3) / 4) * lado * lado;
    }
    
    @Override
    public double perimetro() {
        return 3 * lado;
    }
    
    

    public double getLado() {
        return lado;
    }
    
    
}
