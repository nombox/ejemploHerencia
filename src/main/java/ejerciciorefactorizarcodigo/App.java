/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciorefactorizarcodigo;

/**
 *
 * @author laura
 */
public class App {

    public static void main(String args[]) {
        Figura[] figuras = {
            new Cuadrado(4),
            new TrianguloEquilatero(3),
            new Rectangulo(5, 2),
            new Circulo(4)
        };

        for (Figura f : figuras) {
            System.out.println(f);
        }
    }
}
