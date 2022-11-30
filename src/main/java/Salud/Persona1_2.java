/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Salud;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Persona1_2 {

    Scanner sc = new Scanner(System.in);
    String tipoDoc;
    String documento;
    String nombre;
    String apellido;
    public double peso;
    public double estatura;
    int edad;
    String genero;
    public double Imc;

    public void pedirDatos() {
        System.out.println("Ingrese el tipo de documento");
        tipoDoc = sc.next();

        System.out.println("Ingrese el número de documento de la persona");
        documento = sc.next();

        System.out.println("Ingrese el nombre de la persona");
        nombre = sc.next();

        System.out.println("Ingrese el apellido de la persona");
        apellido = sc.next();

        System.out.println("Ingrese el peso de la persona");
        peso = sc.nextDouble();

        System.out.println("Ingrese la estatura de la persona");
        estatura = sc.nextDouble();

        System.out.println("Ingrese la edad de la persona");
        edad = sc.nextInt();

        System.out.println("Ingrese el genero de la persona");
        genero = sc.next();
    }

    public void mostrarPersona() {
        System.out.println("La persona " + nombre + " " + apellido + " que tiene " + tipoDoc + " con el número " + documento + " de genero " + genero + " tiene " + edad + " años con un peso de " + peso + " kg y una estatura de " + estatura + " metros");

    }

    /*public void calcularImc(){
        pesoActual = peso/Math.pow(pesoActual, 2); 
        
        if (pesoActual <20 ){
            System.out.println("El está por debajo de lo ideal");
        }
        else if (pesoActual == 20 || pesoActual <= 25){
            System.out.println("Está en el peso ideal");
        }
        else{
            System.out.println("Tiene sobrepeso");
        }
    }*/
    public String calcularImc() {
        Imc = peso / Math.pow(estatura, 2);
        String resultado;
        if (Imc < 20) {
            resultado = "Peso bajo";
        } else if (Imc == 20 || Imc <= 25) {
            resultado = "Peso ideal";
        } else {
            resultado = "Tiene sobrepeso";
        }

        return resultado;
    }

    public void mayorEdad() {

        if (edad > 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

}
