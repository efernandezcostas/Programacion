/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin12_01;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Coche {
 
    private static String matricula;
    private static String marca;

    public Coche() {
    }    
    
    
    public static void datosCoche(){
        matricula=JOptionPane.showInputDialog("Matricula del coche: ");
        marca=JOptionPane.showInputDialog("Marca del coche: ");

        
    }

    public static void facturaCoche(){
        
        float tiempo=Float.parseFloat(JOptionPane.showInputDialog("Horas dentro del garaje: "));
        float precio;
        if(tiempo<=3){
            precio=(float)(tiempo*1.5);
        }else{
            precio=(float)(3*1.5+(tiempo-3)*0.20);
        }
        
        
        float cartosR=Float.parseFloat(JOptionPane.showInputDialog("Precio final: "+precio+"€"));
        float cartosD=(float)(cartosR-precio);
        
        JOptionPane.showMessageDialog(null, "FACTURA"+"\nMATRICULA COCHE: "+matricula+"\nMARCA: "+marca +"\nTEMPO: "+tiempo+" horas"+
                "\nPREZO: "+precio+" €"+"\nCARTOS RECIBIDOS: "+cartosR+" €"+"\nCARTOS DEVOLTOS: "+cartosD+" €"+"\nGRAZAS POR USAR O NOSO APARCADOIRO");
        
    }
    
}
