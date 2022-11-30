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
public class Calculadora {
    
    //Atributos
    int num1;
    int num2;
    
    //Métodos
    //1.Método sin valor de retorno que sume los dos números
    public void sumaNum(){
        
        
        int suma = num1 + num2;
        System.out.println("El resultado de la operación suma es de " + suma);
        
    }
    
    //2.Método con valor de retorno que reste los dos números 
    public int restaNum(){
        
        int resta = num1 - num2;
        return resta;        
    }

    //3.Método con valor de retorno que devuelva cual es el número mayor
    public int numMayor(){
        
        int numMayor;
        if (num1 < num2){
            
            System.out.println("El numero mayor es " + num2);          
            numMayor = num2;
        }
        else {
            System.out.println("El número mayor es " + num1);
            numMayor = num1;
        }
        
        return numMayor;
    }
    
    //4.Método sin valor de retorno que devuelva cual es el número menor
    public void numMenor(){
        if (num1 > num2){
            int numMenor; 
            System.out.println("El numero menor es " + num2);          
            numMenor = num2;
        }
        else {
            System.out.println("El número menor es " + num1);
            
        }
    }

    //5.Método con valor de retorno que eleve al exponente que sea indicado por el usuario
    public double potencia1(){
        
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("A qué número desea elevar el " + num1);
        double numExpon1 = sc.nextDouble();
        numExpon1 = (Math.pow(num1, numExpon1));
        System.out.println("El resultado de la operacion de exponenciacion es de " + numExpon1);
        return numExpon1;
    }
     public double potencia2(){
        
        Scanner sc = new Scanner (System.in);
                
        System.out.println("A qué número desea elevar el " + num2);
        double numExpon2 = sc.nextDouble();
        numExpon2 = (Math.pow(num2, numExpon2));
        System.out.println("El resultado de la operacion de exponenciacion es de " + numExpon2);
        return numExpon2;
    }
    
}
