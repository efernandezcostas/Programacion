package boletin04_1;


public class Libro {
    
	private String titulo;
	private String autor;
	private int ano;
	private short numPaginas;
	private float valoracion;
    
	public Libro(){
	}
    
	public Libro(String tit,String aut,int an,short nump){
    	titulo=tit;
    	autor=aut;
    	ano=an;
    	numPaginas=nump;   	 
	}
    
	public void setTitulo(String tit){
    	titulo=tit;
	}
    
	public void setAutor(String aut){
    	autor=aut;
	}
    
	public void setAno(int an){
    	ano=an;
	}
    
	public void setNumPaginas(short nump){
    	numPaginas=nump;
	}
    
	public void setValoracion(float val){
    	valoracion=val;
	}
    
	public void getLibro(){
    	System.out.println("Título: "+titulo+"\nAutor: "+autor+"\nAno: "+ano+"\nNumero de páxinas: "+numPaginas+"\n");
	}

    
}
