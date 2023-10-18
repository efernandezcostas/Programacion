
package boletinextra02_2;

import java.util.Scanner;


public class BoletinExtra02_2 {

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        Ecuacion primera1=new Ecuacion();
        
        System.out.print("Escribe o número A: ");
        primera1.setNA(sc.nextDouble());
        
        System.out.print("Escribe o número B: ");
        primera1.setNB(sc.nextDouble());
        
        System.out.print("Escribe o número C: ");
        primera1.setNC(sc.nextDouble());
        
        primera1.getEcuacion();

        
    }
    
}