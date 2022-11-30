/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import Salud.Persona1_2;


/**
 *
 * @author Jennifer
 */
public class Inicio1_2 {
    public static void main(String[] args) {
        
        Persona1_2 datos = new Persona1_2();
        
        datos.pedirDatos();
        datos.mostrarPersona();
        
        String resultado = datos.calcularImc();
        System.out.println(resultado);
        if (resultado.equalsIgnoreCase("Peso bajo")){
            System.out.println("El peso esta por debajo de lo ideal");
        }
        else if (resultado.equalsIgnoreCase("Peso ideal")){
            System.out.println("Está en el peso ideal");
        }
        else{
            System.out.println("Sobrepeso");
        }
        
        
    }
}
