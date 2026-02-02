/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploNominas;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Analista extends Informatico {
    //constructor   
    public Analista(String dni, String nombre, double salarioBase, String titulacion){
    super(dni, nombre, salarioBase, titulacion);
    }
    
    @Override
    //metodo polimorfismo
    public double calculoSalarioFinal(){
    double complemento = this.getSalarioBase() * 0.3;
    return this.getSalarioBase() + complemento;
    }
}
