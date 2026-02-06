/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploNominas;

import java.util.ArrayList;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Empresa {
    private String cif;
    private String nombre;
    private ArrayList<Trabajador> trabajadoresNomina = new ArrayList<>();
    
    //Constructores
    public Empresa(){
    }
    
    public Empresa(String cif, String nombre){
    this.cif = cif;
    this.nombre = nombre;
    this.trabajadoresNomina = new ArrayList<>();
    }
    
    /**
     * @return the cif
     */
    public String getCif() {
        return cif;
    }

    /**
     * @param cif the cif to set
     */
    public void setCif(String cif) {
        this.cif = cif;
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
     * @return the trabajadoresNomina
     */
    public ArrayList<Trabajador> getTrabajadoresNomina() {
        return trabajadoresNomina;
    }

    /**
     * @param trabajadoresNomina the trabajadoresNomina to set
     */
    public void setTrabajadoresNomina(ArrayList<Trabajador> trabajadoresNomina) {
        this.trabajadoresNomina = trabajadoresNomina;
    }
    
    //METODO para agregar trabajador
    
    public boolean ingresarTrabajador(Trabajador trabajador){
    if(!trabajadoresNomina.contains(trabajador)){
        return trabajadoresNomina.add(trabajador);
    }
    return false;
    }
    
    @Override
    public String toString(){
    
    String resultado = "LISTA DE TRABAJADORES DE LA EMRPESA " + this.nombre+"\n";
    
    for(Trabajador t: trabajadoresNomina){
        resultado += t.toString()+"\n";
    }
    return resultado;
    }
    
}
