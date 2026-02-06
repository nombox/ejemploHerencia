/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploNominas;

/**
 *
 * @author sebastian.eduardo.va
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion de empresa
        Empresa empresa1 = new Empresa("F27352657","Papolen");
        
        //CREACION DE EMPLEADOS
        //ANALISTA
        Analista analista1 = new Analista("86005937J", "Pedro", 1500);
        empresa1.ingresarTrabajador(analista1);
        Analista analista2 = new Analista("93529763X", "Carlos", 1600);
        empresa1.ingresarTrabajador(analista2);
        
        //PROGRAMADORES
        Programador programador1 = new Programador("32723186M", "Samanta", 1300);
        empresa1.ingresarTrabajador(programador1);
        Programador programador2 = new Programador("67703843P", "Gimena", 1400);
        empresa1.ingresarTrabajador(programador2);
         
        //ADMINISTRATIVOS
        Administrativo administrativo1 = new Administrativo("44756217B", "Sarai", 1250, 3);
        empresa1.ingresarTrabajador(administrativo1);
        Administrativo administrativo2 = new Administrativo("23929595G", "Carmen", 1300, 5);
        empresa1.ingresarTrabajador(administrativo2);
        
        //AUXILIARES
        Auxiliar auxiliar1 = new Auxiliar("44756217B", "Martin", 1150);
        empresa1.ingresarTrabajador(auxiliar1);
        Auxiliar auxiliar2 = new Auxiliar("44756217B", "Martin", 1200);
        empresa1.ingresarTrabajador(auxiliar2);
        
        System.out.println(empresa1);
    }
    
}
