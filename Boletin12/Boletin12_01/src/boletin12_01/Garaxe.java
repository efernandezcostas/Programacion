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
public class Garaxe {
    
    private Coche coche;
    public static int numeroCoches=0;
    
   
    public void contarCoches(){
        
        
        while(numeroCoches<5){
            JOptionPane.showMessageDialog(null, "Prazas dispoñibles");
            Coche.datosCoche();
            Coche.facturaCoche();
            numeroCoches++;
        }
        
       JOptionPane.showMessageDialog(null, "Completo");
    
    }
}
