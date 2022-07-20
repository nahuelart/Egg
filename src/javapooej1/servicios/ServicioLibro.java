
package javapooej1.servicios;

import java.util.Scanner;
import javapooej1.entidades.Libro;

public class ServicioLibro {

    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
    public Libro ingresarLibro (){
        
      System.out.println("Ingresa titulo del libro");
      String titulo = leer.next();
      
      System.out.println("Ingresa autor del libro");
      String autor = leer.next();
      
      System.out.println("Ingresa número de paginas del libro");
        int NumPag = leer.nextInt();
      
      System.out.println("Ingresa el ISBN del libro");
        int isbn = leer.nextInt();
      
      
      return new  Libro(titulo, autor, NumPag, isbn);    
    }
  
}
