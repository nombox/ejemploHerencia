/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploNominas;

/**
 *
 * @author sebastian.eduardo.va
 */
public abstract class Trabajador {
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
     * @return the salarioBase
     */
    public double getSalarioBase() {
        return salarioBase;
    }


    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the salarioFinal
     */
    public double getSalarioFinal() {
        return salarioFinal;
    }
    
        
    //Metodo
    public abstract double calculoSalarioFinal();
    
    
    @Override
    public boolean equals(Object o){
        
        if(this == o){
        return true;
        }
        
        if(o == null || getClass() != o.getClass()){
        return false;
        }
        
        Trabajador e = (Trabajador) o;
        return(this.getDni().equals(e.getDni()));
        
    }
    
    @Override
    public String toString(){
        return this.getClass().getSimpleName()+": {dni="+this.dni+", nombre="+this.nombre+", salarioB="+this.salarioBase+", salarioF="+this.salarioFinal+"}\n";
    
    }
}
