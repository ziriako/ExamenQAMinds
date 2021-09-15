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
public class EmpleadoNocturno extends Empleado{
    
    public EmpleadoNocturno(String nombre, String apellido){
        super(nombre, apellido);
    }
    
    @Override
    public String tipoTurno(){
        turno = "Nocturno";
        return turno;
    }
}
