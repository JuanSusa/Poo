/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package conceptos;

import clasesAbstractas.Circulo;
import clasesAbstractas.Cuadrado;
import clasesAbstractas.Rectangulo;
import clasesAbstractas.Triangulo;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Prueba {

    public static void main(String[] args) {
        /*Aprendiz nombre = new Aprendiz();
        nombre.cambiarNombre();*/
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {

            int opcion; //se guarda la opcion del usuario

            System.out.println("""
                               1. Para calcular el area del cuadrado.
                               2. Para calcular el area del circulo.
                               3. Para calcular el area del triangulo
                               4. Para calcular el areal rectangulo
                               5. Salir""");

            try {
                System.out.println("Ingrese una de las opciones");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1 -> {
                        System.out.println("Has seleccionado, calcular area del cuadrado");
                        //Area Cuadrado
                        System.out.println("Ingrese el valor del lado del cuadrado");
                        float lado = sc.nextFloat();
                        Cuadrado c1 = new Cuadrado();
                        c1.setLado(lado);//establecer valor del atributo
                        c1.clacularArea();//declarar metodo abstracto
                        break;
                    }

                    case 2 -> {
                        System.out.println("Has seleccionado, calcular area del circulo");
                        //Area Circulo
                        System.out.println("Ingrese el valor del radio del circulo");
                        float radio = sc.nextFloat();
                        Circulo cr1 = new Circulo();
                        cr1.setRadio(radio);
                        cr1.clacularArea();
                        break;
                    }

                    case 3 -> {
                        System.out.println("Has seleccionado, calcular area del triangulo");
                        //Area Triangulo
                        System.out.println("Ingrese el valor de la altura del triangulo");
                        float altura = sc.nextFloat();
                        System.out.println("Ingrese el valor de la base del triangulo");
                        float base = sc.nextFloat();
                        Triangulo t1 = new Triangulo();
                        t1.setAltura(altura);
                        t1.setBase(base);
                        t1.clacularArea();
                        break;
                    }

                    case 4 -> {
                        System.out.println("Has seleccionado, calcular area del rectangulo");
                        //Area Rectangulo
                        System.out.println("Ingrese el valor de la altura del rectangulo");
                        float altura2 = sc.nextFloat();
                        System.out.println("Ingrese el valor de la base del rectangulo");
                        float base2 = sc.nextFloat();
                        Rectangulo r1 = new Rectangulo();
                        r1.setArea(altura2);
                        r1.setBase(base2);
                        r1.clacularArea();

                        break;
                    }
                    
                    case 5 ->{
                        salir = true;
                        break;
                    }
                    default -> {
                        System.out.println("Seleccion incorrecta");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();

            }
            break;
        }

    }

}
