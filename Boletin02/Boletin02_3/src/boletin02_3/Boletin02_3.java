
package boletin02_3;

import java.util.Scanner;

public class Boletin02_3 {


    public static void main(String[] args) {
        
        double euros,dolares;
        final double cambio=1.06;
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Euros: ");
        euros = sc.nextDouble();
        
        dolares=euros*cambio;
        
        System.out.println("dolares: "+dolares);
        

        
    }
    
}