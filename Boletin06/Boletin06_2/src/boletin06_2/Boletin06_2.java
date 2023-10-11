
package boletin06_2;

import javax.swing.JOptionPane;


public class Boletin06_2 {


    public static void main(String[] args) {
        

        Satelite sat1 = new Satelite(Double.parseDouble(JOptionPane.showInputDialog("Valor do meridiano: ")),Double.parseDouble(JOptionPane.showInputDialog("Valor do paralelo: ")),Double.parseDouble(JOptionPane.showInputDialog("Distancia da Terra: ")));
        sat1.verPosicion();
        
        
    }
    
}
