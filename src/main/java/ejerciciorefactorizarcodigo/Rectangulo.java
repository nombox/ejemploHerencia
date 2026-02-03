/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorefactorizarcodigo;

/**
 *
 * @author laura
 */
public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        super("Rectangulo");
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double area() {
        return base * altura;
    }
    
    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }

    
}
