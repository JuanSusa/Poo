/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Carisellazo implements Juego {
    
    Scanner sc = new Scanner(System.in);
    //Atributos
    private String nombre;
    private int opcion;
    private int moneda;
            
    @Override
    public void iniciar() {
        System.out.println("Ingrese el nombre del jugador");
        nombre = sc.next();
    }

    @Override
    public void jugar() {
        System.out.println("Escoge: "
                + "1. Para cara"
                + "2. Para sello");
        opcion = sc.nextInt();
        System.out.println("..... Moneda girando.....");
        Random aleatorio = new Random();
        moneda = aleatorio.nextInt(2)+1;        
    }

    @Override
    public void finalizar() {
        if(moneda == 1 && opcion == 1){
            System.out.println("Sailo cara,seleccionaste cara, Ganaste!" + nombre);
        }
        else if (moneda == 1 && opcion == 2){
            System.out.println("Salio cara, seleccionaste sello, Perdiste!" + nombre);
        }
        else if (moneda == 2 && opcion == 2){
            System.out.println("Salio sello, seleccionaste sello, Ganaste!" + nombre);
        }
        else if (moneda == 2 && opcion == 1){
            System.out.println("Salio cara, seleccionaste cara, perdiste!" + nombre);
        }
        else{
            System.out.println("Seleccion incorrecta");
        }
        sc.close();
    }
    
}
