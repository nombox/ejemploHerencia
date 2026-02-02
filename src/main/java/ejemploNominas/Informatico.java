/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploNominas;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Informatico extends Trabajador {
    private String titulacion;
    
    //constructores
    public Informatico(String dni, String nombre, double salarioBase, String titulacion){
    super(dni, nombre, salarioBase);
    this.titulacion = titulacion;
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
