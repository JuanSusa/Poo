/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesAbstractas;

/**
 *
 * @author Jennifer
 */
public class Rectangulo extends Figura{
    
    //Atributos
    private float altura;
    private float base;

    public Rectangulo() {
        
    }
    public Rectangulo(float altura, float base) {
        this.altura = altura;
        this.base = base;
    }
    public float getArea() {
        return altura;
    }

    public void setArea(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    @Override
    public void clacularArea() {
        float area = base * altura;
        System.out.println("El area del rectangulo es " + area);
    }
    
}
