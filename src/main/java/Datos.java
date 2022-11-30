
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
public class Datos {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in); 
        
        Aprendiz nombre = new Aprendiz();
        System.out.println("Ingrese el nombre del aprendiz");
        nombre.direccionAprendiz = leer.next();
        
        Aprendiz edad = new Aprendiz();
        System.out.println("Ingrese la edad del aprendiz");
        edad.edadAprendiz = leer.nextInt();
        
        Aprendiz direccion = new Aprendiz();
        System.out.println("Ingrese la dirección del aprendiz");
        direccion.direccionAprendiz = leer.next();
        
        Aprendiz telefono = new Aprendiz();
        System.out.println("Ingrese el número de contacto del aprendiz");
        telefono.telefonoAprendiz = leer.next();
        
        Aprendiz ficha = new Aprendiz();
        System.out.println("Digite el número de la ficha a la que peretenece el aprendiz");
        ficha.fichaAprendiz = leer.next();
        
        System.out.println("El aprendiz " + nombre.direccionAprendiz + " tiene " + edad.edadAprendiz + " años y que reside en la dirección " + direccion.direccionAprendiz + " su número de contacto es " + telefono.telefonoAprendiz + " y que pertenece a la ficha " + ficha.fichaAprendiz);


    }
    
}
