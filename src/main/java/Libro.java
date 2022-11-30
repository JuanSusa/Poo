
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jennifer
 */
public class Libro {
    
    Scanner sc = new Scanner(System.in);
    //Atributos
    private int idLibro;
    public String nombreLibro;
    private String autorLibro;
    private String categoriaLibro;
    private String editorialLibro;
    
    //Métodos
    public Libro(){
        
    }
    
    public Libro(int idLibro,String nombreLibro,String autorLibro, String categoriaLibro, String editorialLibro){
        
        this.idLibro = idLibro;
        this.nombreLibro = nombreLibro;
        this.autorLibro = autorLibro;
        this.categoriaLibro = categoriaLibro;
        this.editorialLibro = editorialLibro;
    }
    
    public void registrarLibro(){
        System.out.println("Ingrese el id del libro");
        idLibro = sc.nextInt();
        
        sc.nextLine(); //Limpieza de buffer
        
        System.out.println("Ingrese el nombre del libro");
        nombreLibro = sc.nextLine();
        
        System.out.println("Ingrese el autor de libro");
        autorLibro = sc.nextLine();
        
        System.out.println("Ingrese la cateforia del libro");
        categoriaLibro = sc.nextLine();
        
        System.out.println("Ingrese la editorial del libro");
        editorialLibro = sc.nextLine();
    }
    
    public void consultarLibro(String nameBook){
        System.out.println(nombreLibro);
        if(nombreLibro.equalsIgnoreCase(nameBook)){
            System.out.println("El libro " + nombreLibro + " fue escrito por " + autorLibro + " es de la editorial " + editorialLibro);
        }
        else {
            System.out.println("El libro no existe");
        }
    }

    public void mostrarLibro(){
        System.out.println("El libro " + nombreLibro + " fue escrito por " + autorLibro);
    }
    
    public void mostrarLibro(String nombreLibro, String autorLibro){
        System.out.println("El libro " + this.nombreLibro +  " fue escrito por " + this.autorLibro);
    }
}
