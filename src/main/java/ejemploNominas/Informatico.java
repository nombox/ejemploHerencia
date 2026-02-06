/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploNominas;

/**
 *
 * @author sebastian.eduardo.va
 */
public abstract class Informatico extends Trabajador {
    protected String titulacion;
    
    //constructores
    public Informatico(String dni, String nombre, double salarioBase){
    super(dni, nombre, salarioBase);
    }

    /**
     * @return the titulacion
     */
    public String getTitulacion() {
        return titulacion;
    }

    /**
     * @param titulacion the titulacion to set
     */
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    
    
    
}
