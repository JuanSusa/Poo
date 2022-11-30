/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import Salud.Persona3;

/**
 *
 * @author Jennifer
 */
public class Incio3 {
    public static void main(String[] args) {
        
        Persona3 datos = new Persona3();
        
        Persona3 datos1 = new Persona3("cc", "1013676004", "Juan", "Susa", 25, (float) 1.70, 70, "Masculino");
        datos1.consultarPersona("Juan");
    }
}
