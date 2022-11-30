/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesAbstractas;

/**
 *
 * @author Jennifer
 */
public class Circulo extends Figura{
    //Atributos
    private float radio;
    
    //Metodos
    public Circulo() {
    
    }
    
    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    @Override
    public void clacularArea() {
        
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es " + area);
    }
}
