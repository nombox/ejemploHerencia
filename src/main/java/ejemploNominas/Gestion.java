/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploNominas;

/**
 *
 * @author sebastian.eduardo.va
 */
public abstract class Gestion extends Trabajador{
    private int antiguedad;
    
    //constructor
    public Gestion(String dni, String nombre, double salarioBase, int antiguedad){
    super(dni, nombre, salarioBase);
    this.antiguedad = antiguedad;
    }
    
    //Constructor para auxiliar
    public Gestion(String dni, String nombre, double salarioBase){
    super(dni, nombre, salarioBase);
    }

    /**
     * @return the antiguedad
     */
    public int getAntiguedad() {
        return antiguedad;
    }

    /**
     * @param antiguedad the antiguedad to set
     */
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
}
