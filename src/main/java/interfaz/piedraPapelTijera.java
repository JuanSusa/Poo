/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class piedraPapelTijera implements Juego1{
    Scanner sc = new Scanner (System.in);    
    //Atributos
    private int eleccion;
    private int juego;
    private String nombreJugador;
    
    @Override
    public void iniciar() {
        System.out.println("Vamos a jugar Piedra, Papel o Tijera donde vas marcar del 1 al 3 según con lo quieras jugar En donde "
                + " 1 es Piedra "
                + " 2 es Papel y "
                + " 3 es Tijera");
        System.out.println("Ingrese el nombre del jugador");
        nombreJugador = sc.next();
    }

    @Override
    public void jugar() {
        System.out.println("Digite un numero para comenzar el juego");
        eleccion = sc.nextInt();
    }

    @Override
    public void finalizar() {
         juego = (int)(Math.random()*3)+1;
        
        if(juego ==1 && eleccion == 1){
            System.out.println("Hubo empate,\n Salio piedra y usted escogio piedra");
        }
        else if (juego==1 && eleccion==2){
            System.out.println("Ganaste!\n Salio piedra y usted escogio papel ");
        }
        else if (juego==1 && eleccion==3){
            System.out.println("Perdiste!\n Salio piedra y usted escogio piedra");
        }
        else if (juego==2 && eleccion==1){
            System.out.println("Perdiste!\n Salio papel y usted escogio piedra");
        }
        else if (juego==2 && eleccion==2){
            System.out.println("Hubo empate\n Salio papel y usted escogio papel");
        }
        else if (juego==2 && eleccion==3){
            System.out.println("Ganaste!\n Salio papel y usted escogio papel");
        }
        else if (juego==3 && eleccion==1){
            System.out.println("Ganaste!\n Salio tijera y usted escogio piedra");
        }
        else if (juego==3 && eleccion==2){
            System.out.println("Perdiste!\n Salio tijera y usted escogio papel");
        }
        else if (juego==3 && eleccion==3){
        juego = (int)(Math.random()*3)+1;
        }       
        
        else{
            System.out.println("Valor incorrecto");
        }
        sc.close();
    }
}
