/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenqa;

/**
 *
 * @author Ziriako
 */
public class Empleado {
    
    String nombre;
    String apellido;
    String turno;
    
    public Empleado(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String tipoTurno(){
        turno = "Diurno";
        return turno;
    }
      
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    
    public void imprimirNombre(){
        System.out.println("Nombre Completo del Empleado: " + this.nombre + " " + this.getApellido()+"\n");
    }
}
