
package boletin04_1;

public class Boletin04_1 {

	public static void main(String[] args) {
    	// TODO code application logic here
   	 
    	Libro libro1 = new Libro("El Hobbit","Stack",1992,(short)145);      	// Creado con el constructor parametrizado
   	 
    	libro1.getLibro();                      	// Obtener los datos del libro1
   	 
    	Libro libro2 = new Libro();             	// Creado con el constructor por defecto
   	 
    	libro2.getLibro();                      	// Obtener los datos del libro2 sin modificar
   	 
    	libro2.setTitulo("El Hobbit 2");     	// Modificado con métodos
    	libro2.setAutor("Stack");
    	libro2.setAno(1994);
    	libro2.setNumPaginas((short)650);
   	 
    	libro2.getLibro();                      	// Obtener los datos del libro2 modificados

	}
    
}
