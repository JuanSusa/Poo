/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jennifer
 */
public class App {
    public static void main(String[] args) throws Exception{
        
        //Usar la clase
        Libro libro1 = new Libro();
        
        Libro libro2 = new Libro(987, "20000 lenguas de viaje submarino",
                "julio verne", "ciencia ficcion", "planeta");
        
        //Ejecucion metodos de la clase
        //libro1.registrarLibro();
        //libro1.consultarLibro("cien anios de soledad");
        //libro2.consultarLibro("20000 lenguas de viaje submarino");
        
        libro1.mostrarLibro();
    }
    
}
