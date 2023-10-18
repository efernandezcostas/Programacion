
package boletin03_1;

import java.util.Scanner;


public class Boletin03_1 {

  
    public static void main(String[] args) {

        
        Scanner sc = new Scanner (System.in);
        
        float prezoPagado,prezoTarifa,desconto;
        
        System.out.print("Prezo tarifa: ");
        prezoTarifa = sc.nextFloat();
        
        System.out.print("Prezo pagado: ");
        prezoPagado = sc.nextFloat();
        
        desconto=100-((100*prezoPagado)/prezoTarifa);
        
        System.out.println("El desconto es: "+desconto+"%");
        
        
    }
    
}