
package javapooej1.entidades;


public class Libro {

    private String titulo;
    private String autor;
    private int NumPag;
    private int isbn ;
    
    public Libro(){
        
    }
    
    public Libro(String titulo, String autor, int NumPag, int isbn ){
       this.titulo = titulo;
       this.autor = autor;
       this.NumPag = NumPag;
       this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return NumPag;
    }

    public void setNumPag(int NumPag) {
        this.NumPag = NumPag;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", NumPag=" + NumPag + ", isbn=" + isbn + '}';
    }
    
    
    
    
}
