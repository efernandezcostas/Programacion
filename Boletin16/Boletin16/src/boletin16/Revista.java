/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin16;

/**
 *
 * @author dam1
 */
public class Revista extends Publicacion {
    
    private int numero;
    
    public Revista(){
        
    }
    
    public Revista (String titulo, String anoPublicacion, int codigo, int numero){
        super (titulo, anoPublicacion, codigo);
        this.numero=numero;
    }

    @Override
    public String toString() {
        return "Revista{" + "numero=" + numero + '}';
    }
    
    
    
}
