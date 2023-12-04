/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin16;

/**
 *
 * @author dam1
 */
public class Libro extends Publicacion {
    
    private Boolean prestado=false;
    
    public Libro(){
        
    }

    public Libro(String titulo, String anoPublicacion, int codigo) {
        super(titulo, anoPublicacion, codigo);
    }
    
    public void setPrestado(Boolean prestado){
        this.prestado=prestado;
    }

    @Override
    public String toString() {
        return "Libro{" + "prestado=" + prestado + '}';
    }
  
}
