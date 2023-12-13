
package boletin18_2;

import javax.swing.JOptionPane;

public class Transporte {
    
    private float precio;
    private int zona;
    private float peso;

    public void calculoEnvios(){

        peso=Float.parseFloat(JOptionPane.showInputDialog("Peso del paquete (kg)"));

        if(peso>5||peso<0){
            JOptionPane.showMessageDialog(null, "Peso inálido");
        }
        else{
            zona=Integer.parseInt(JOptionPane.showInputDialog("Zona\n1. Ámerica do Norte\n2. Ámerica Central\n3. Ámerica do Sur\n4. Europa\n5. Asia"));

            switch(zona){
                case 1:
                    precio=24*peso;
                    break;
                case 2:
                    precio=20*peso;
                    break;
                case 3:
                    precio=21*peso;
                    break;
                case 4:
                    precio=10*peso;
                    break;
                case 5:
                    precio=18*peso;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta");
            }
            if(zona>=1&&zona<=5){
            JOptionPane.showMessageDialog(null, "Peso do paquete: "+peso+"kg"+"\nPrecio del envío: "+precio+"€");
            }

        }
    }
}
