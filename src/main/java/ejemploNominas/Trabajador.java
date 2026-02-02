/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploNominas;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Trabajador {
    private String dni;
    private String nombre;
    private double salarioBase;
    private double salarioFinal;
    
    //Constructores
    public Trabajador(){
    
    }
    
    public Trabajador(String dni, String nombre, double salarioBase){
    this.dni = dni;
    this.nombre = nombre;
    this.salarioBase = salarioBase;
    this.salarioFinal = 0;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the salarioBase
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * @return the salarioFinal
     */
    public double getSalarioFinal() {
        return salarioFinal;
    }

    /**
     * @param salarioFinal the salarioFinal to set
     */
    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }
    
    //Metodo
    public double calculoSalarioFinal(){
        return this.salarioBase;
    }
}
