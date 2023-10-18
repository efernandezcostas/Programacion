
package boletin02_5;

import java.util.Scanner;


public class Boletin02_5 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        
        float millas,metros;
        final int MILLASTOMETROS=1852;
        
        System.out.print("millas: ");
        millas=sc.nextFloat();
        
        metros=millas*MILLASTOMETROS;
        System.out.println("metros: "+metros);
        
        
    }
    
}
