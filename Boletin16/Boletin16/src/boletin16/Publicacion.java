/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin16;

/**
 *
 * @author dam1
 */
public class Publicacion {
    
    private String titulo;
    private String  anoPublicacion;
    private int codigo;
    
    public Publicacion(){
        
    }
    
    public Publicacion(String titulo,String anoPublicacion, int codigo){
        this.titulo=titulo;
        this.anoPublicacion=anoPublicacion;
        this.codigo=codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAnoPublicacion() {
        return anoPublicacion;
    }
    
    public int getCodigo(){
        return codigo;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "titulo=" + titulo + ", anoPublicacion=" + anoPublicacion + ", codigo=" + codigo + '}';
    }


    
    
    
    
    
}
