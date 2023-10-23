
package boletinextra04_1;

import javax.swing.JOptionPane;

public class BoletinExtra04_1 {


    public static void main(String[] args) {
        
        Cuentas obx1=new Cuentas();
        obx1.verCantidadNum(Integer.parseInt(JOptionPane.showInputDialog("Escribe un número comprendido entre el 0 y el 99999")));

    }
    
}
