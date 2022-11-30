/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Salud;

/**
 *
 * @author Jennifer
 */
public class Empleado  extends Persona4{
    
    //Atributos
    private String cargo;
    private int valorHora;
    private int horasTrabajadas;
    private String departamento;
    
    public Empleado(){
        
    }

    public Empleado(String cargo, int valorHora, int horasTrabajadas, String departamento, 
            String tipoDoc, String documento, String nombre, String apellido, String genero, double peso, double estatura, int edad) {
        super(tipoDoc, documento, nombre, apellido, genero, peso, estatura, edad);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }

    public Empleado(String cargo, int valorHora, int horasTrabajadas, String departamento) {
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public double calculoHonorarios(){
        double totalHonorarios = valorHora * horasTrabajadas;
        double reteIca = totalHonorarios * 0.00966;
        double valorTotal = reteIca - totalHonorarios;
        
        return valorTotal; 
    }   

}
