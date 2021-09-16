/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenqa;
import java.util.Scanner;

/**
 *
 * @author Ziriako
 */
public class ExamenQA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre;
        String apellido;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido:");
        apellido = entrada.nextLine();
        
        Empleado nuevoEmpleado = new Empleado(nombre, apellido);
        
        System.out.println("Nombre: \n*" +nuevoEmpleado.getNombre()+ "\nApellido: \n*" + nuevoEmpleado.getApellido());
        System.out.println("Tipo de turno: \n*" + nuevoEmpleado.tipoTurno());
        nuevoEmpleado.imprimirNombre();
        
        System.out.println("Ingrese el nombre:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido:");
        apellido = entrada.nextLine();
        
        EmpleadoNocturno empleadoNoche = new EmpleadoNocturno(nombre, apellido);
        
        System.out.println("Nombre: \n*" + empleadoNoche.getNombre()+ "\nApellido: \n*" + empleadoNoche.getApellido());
        System.out.println("Tipo de turno: \n*" + empleadoNoche.tipoTurno());
        empleadoNoche.imprimirNombre();
    }
    
}
