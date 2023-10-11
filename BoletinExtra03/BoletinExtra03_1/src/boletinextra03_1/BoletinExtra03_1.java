
package boletinextra03_1;

import javax.swing.JOptionPane;

public class BoletinExtra03_1 {

    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.setNomeCliente();
        conta1.setNumConta();
        conta1.setSaldo();
        conta1.setTipoInterese();
        
        conta1.ingresar();
        conta1.retirar();
        System.out.println(conta1.getSaldo());
        
        conta1.transferencia(0, Double.parseDouble(JOptionPane.showInputDialog("Cantidad a transferir: ")));      
    }
    
}
