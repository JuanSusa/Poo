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
public class Persona3 {
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
    
    public Persona3(){
        
    }
    
    public Persona3(String tipoDoc, String documento, String nombre, String apellido, int edad, float estatura, double peso, String genero) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.genero = genero;
        
    }
    
    public void consultarPersona(String nombrePaciente){
        if (nombrePaciente.equalsIgnoreCase(nombre)){
            System.out.println("El paciente" + nombre + " " + apellido + " identificado con " + tipoDoc +
                    " y número " + documento + " de genero " + genero + " con " + edad + " años" + " y con un peso de "
                    + peso + " kg y una estatura de " + estatura + " cms.");
        }
        else {
            System.out.println("Paciente no existe");
        }
    }
}
