/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesAbstractas;

/**
 *
 * @author Jennifer
 */
public class Triangulo extends Figura{
    
    //Atributos
    private float base;
    private float altura;

    public Triangulo() {
        
    }
    
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    @Override
    public void clacularArea() {
        float area = base * altura / 2;
        System.out.println("El area del triangulo es " + area);
    }
    
}
