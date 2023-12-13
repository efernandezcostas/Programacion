
package boletin07_4;

import javax.swing.JOptionPane;

public class Boletin07_4 {

    public static void main(String[] args) {
        

        
        Peso obx1=new Peso();
        obx1.verPeso(JOptionPane.showInputDialog("Nombre de la 1ª persona"),Float.parseFloat(JOptionPane.showInputDialog("Peso de la 1ª persona")),
                    JOptionPane.showInputDialog("Nombre de la 2ª persona"),Float.parseFloat(JOptionPane.showInputDialog("Peso de la 2ª persona")));

    }
    
    
}
