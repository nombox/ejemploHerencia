/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploNominas;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Administrativo extends Gestion {
    
    //constructores
    public Administrativo(String dni, String nombre, double salarioBase, int antiguedad){
    super(dni, nombre, salarioBase, antiguedad);
    }
    
    @Override
    //metodo polimorfismo
    public double calculoSalarioFinal(){
    double complemento = this.getSalarioBase() + (20 * this.getAntiguedad());
    return complemento;
    }
}
