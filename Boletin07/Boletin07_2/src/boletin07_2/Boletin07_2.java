
package boletin07_2;

import javax.swing.JOptionPane;


public class Boletin07_2 {


    public static void main(String[] args) {
        
        
        
        Operacions obx1=new Operacions();
        obx1.facerOperacion(Short.parseShort(JOptionPane.showInputDialog("Primeiro número")),Short.parseShort(JOptionPane.showInputDialog("Segundo número")));

        
    }
    
}
