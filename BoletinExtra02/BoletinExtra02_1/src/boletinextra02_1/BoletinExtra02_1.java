
package boletinextra02_1;

import java.util.Scanner;


public class BoletinExtra02_1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        Calculos produto1=new Calculos();
        
        System.out.print("Escribe o nome do produto: ");
        produto1.setNomeProduto(sc.nextLine());
        
        System.out.print("Escribe o prezo sen IVA: ");
        produto1.setPrezo(sc.nextFloat());
        
        produto1.getPrezoFinal();


    }
    
}
