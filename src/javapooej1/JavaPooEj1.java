/*
* Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
* Autor, Número de páginas, y un constructor con todos los atributos pasados por
* parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
* datos al usuario y luego informar mediante otro método el número de ISBN, el título,
* el autor del libro y el numero de páginas.
*/
package javapooej1;

import java.util.Scanner;
import javapooej1.entidades.Libro;
import javapooej1.servicios.ServicioLibro;


public class JavaPooEj1 {

    public static void main(String[] args) {
    
       ServicioLibro sl = new ServicioLibro();
       Libro n1 = sl.ingresarLibro();

        System.out.println(n1);
        
    
    }
    
}
