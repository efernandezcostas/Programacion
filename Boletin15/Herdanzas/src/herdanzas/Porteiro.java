/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herdanzas;

/**
 *
 * @author dam1
 */
public class Porteiro extends Futbolista{
    
    private float estirada;

    public Porteiro(float estirada, int dorsal, String demarcacion, int id, String nome, String apelidos, int edade) {
        super(dorsal, demarcacion, id, nome, apelidos, edade);
        this.estirada = estirada;
    }

    public static void pararGoles(){
        
    }

    @Override
    public String toString() {
        return "Porteiro{" + "estirada=" + estirada + '}';
    }
    
    
    
    
}
