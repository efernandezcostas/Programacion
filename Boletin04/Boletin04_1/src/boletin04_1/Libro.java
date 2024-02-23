package boletin04_1;

/**
 * @author Enrique Fdez
 * @version 1
 */
public class Libro {
	/**
	 * Titutlo del libro
	 */
	private String titulo;
	/**
	 * Autor del libro
	 */
	private String autor;
	/**
	 * Año de publicación
	 */
	private int ano;
	/**
	 * Número de páginas
	 */
	private short numPaginas;
	/**
	 * Valoración
	 */
	private float valoracion;


	public Libro(){
	}

	/**
	 * Constructor
	 * @param tit título
	 * @param aut autor
	 * @param an año
	 * @param nump número de páginas
	 */
	public Libro(String tit,String aut,int an,short nump){
    	titulo=tit;
    	autor=aut;
    	ano=an;
    	numPaginas=nump;   	 
	}

	/**
	 * Setter título
	 * @param tit título
	 */
	public void setTitulo(String tit){
    	titulo=tit;
	}

	/**
	 * Setter autor
	 * @param aut autor
	 */
	public void setAutor(String aut){
    	autor=aut;
	}

	/**
	 * Setter año
	 * @param an año
	 */
	public void setAno(int an){
    	ano=an;
	}

	/**
	 * Setter número de páginas
	 * @param nump número de páginas
	 */
	public void setNumPaginas(short nump){
    	numPaginas=nump;
	}

	/**
	 * Setter valoración
	 * @param val valoración
	 */
	public void setValoracion(float val){
    	valoracion=val;
	}

	/**
	 * Recibe todos los datos del libro por consola
	 */
	public void getLibro(){
    	System.out.println("Título: "+titulo+"\nAutor: "+autor+"\nAno: "+ano+"\nNumero de páxinas: "+numPaginas+"\n");
	}

    
}
