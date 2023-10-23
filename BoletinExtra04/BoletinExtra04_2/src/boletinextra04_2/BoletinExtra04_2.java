
package boletinextra04_2;

import java.util.Scanner;


public class BoletinExtra04_2 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        Uvas obx1 = new Uvas();
        
        

        System.out.print("Indica el precio inicial: ");
        obx1.setPrecioInicial(sc.nextDouble());
        System.out.print("Indica la cantidad de kilos: ");
        obx1.setKilos(sc.nextDouble());
        System.out.print("Indica el tipo (A/B): ");
        char tipoU=sc.next().charAt(0);
        obx1.setTipo(tipoU);
        System.out.print("Indica el tamaño (1/2): ");
        obx1.setTamano(sc.nextByte());
        
        obx1.calcularPrecio();
    }
    
}
