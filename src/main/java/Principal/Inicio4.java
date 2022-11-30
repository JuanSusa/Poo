/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import Salud.Empleado;


/**
 *
 * @author Jennifer
 */
public class Inicio4 {
    public static void main(String[] args) {
        
        Empleado datos1 = new Empleado("programador", 50000, 8, "Backend", "Cc", "1013676004", 
                "juan", "susa", "masculino", 70, 170,25);
        
        System.out.println("El empleado" + datos1.getNombre() + " " + datos1.getApellido() + " identificado con " + datos1.getTipoDoc() + " número" +
                datos1.getDocumento() + " en el oficio de " + datos1.getCargo() + " como " + datos1.getDepartamento() + " con un sueldo por hora de " +
                datos1.getValorHora() + " trabaja al dia un total de " + " horas" + datos1.getHorasTrabajadas() + " y recibe un pago de honorarios por " + datos1.calculoHonorarios());
        
    }
    
}
