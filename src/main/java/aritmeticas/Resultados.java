/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aritmeticas;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Resultados {
    public static void main(String[] args) {
        int num1,num2;
        Calculadora resultados = new Calculadora();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el primer número ");
        resultados.num1 = sc.nextInt();
        System.out.println("Digite el segundo número ");
        resultados.num2 = sc.nextInt();
       
        resultados.sumaNum();
        
        resultados.restaNum();
        System.out.println("El resultado de la operacón resta es de " + resultados.restaNum());
                
        resultados.numMayor();
        
        resultados.potencia1();
        resultados.potencia2();
        
    }
    
}
