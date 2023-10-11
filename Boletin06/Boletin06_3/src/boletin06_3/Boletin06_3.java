
package boletin06_3;

import javax.swing.JOptionPane;


public class Boletin06_3 {

    public static void main(String[] args) {
        
        Circulo cir1 = new Circulo(Double.parseDouble(JOptionPane.showInputDialog("Escribe o radio: ")));
        
        cir1.calcularArea();
        cir1.calcularLonxitude();
        

    }
    
}
