/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploNominas;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Programador extends Informatico {
    
    //Constructor
    public Programador(String dni, String nombre, double salarioBase){
    super(dni, nombre, salarioBase);
    }
    
    @Override
    //metodo polimorfismo
    public double calculoSalarioFinal(){
    double complemento = this.getSalarioBase() * 0.15;
    return this.getSalarioBase() + complemento;
    }
    
}
