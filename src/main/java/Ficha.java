
import java.util.Scanner;
import sena.Aprendiz;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jennifer
 */
public class Ficha {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Aprendiz camilo = new Aprendiz();
        //Asiganar valor a un atributo
        
        System.out.println("Ingrese la edad ");
        camilo.edadAprendiz = leer.nextInt();
        
        leer.nextLine();
        
        System.out.println("Ingrese la direccion ");
        camilo.direccionAprendiz = leer.next();
        
        System.out.println("Camilo tiene " + camilo.edadAprendiz + " años y estudia en la direccion " + camilo.direccionAprendiz);
    }
    
    
}
