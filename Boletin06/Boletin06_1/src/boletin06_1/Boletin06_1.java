
package boletin06_1;

import javax.swing.JOptionPane;


public class Boletin06_1 {

    public static void main(String[] args) {
        
        Coche coche1 = new Coche();
        coche1.acelerar(Integer.parseInt(JOptionPane.showInputDialog("Teclea canto acelera: ")));
        coche1.frenar(Integer.parseInt(JOptionPane.showInputDialog("Teclea canto frena: ")));
        JOptionPane.showMessageDialog(null,"A velocidade é de "+ coche1.getVelocidade()+" km/h");
    }
    
}
