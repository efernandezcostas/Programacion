/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herdanzas;

/**
 *
 * @author dam1
 */
public class Masaxista extends SeleccionFutbol{
    
    private String titulacion;
    private String anosExperiencia;

    public Masaxista(String titulacion, String anosExperiencia, int id, String nome, String apelidos, int edade) {
        super(id, nome, apelidos, edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }
    
    public static void darMasaxes(){
        
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public String getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(String anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    

    @Override
    public String toString() {
        return "Masaxista{" + "titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia + '}';
    }
    
    
    
    
    
    
}
