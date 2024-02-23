/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herdanzas;

/**
 *
 * @author dam1
 */
public class Entrenador extends SeleccionFutbol {
    
    private String idFederacion;

    public Entrenador(String idFederacion, int id, String nome, String apelidos, int edade) {
        super(id, nome, apelidos, edade);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    
    
    public static void dirixirPartido(){
        
    }
    
    public static void dirixirEntrenamento(){
        
    }

    @Override
    public String toString() {
        return "Entrenador{" + "idFederacion=" + idFederacion + '}';
    }
}
