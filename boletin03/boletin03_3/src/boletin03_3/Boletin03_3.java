
package boletin03_3;

import java.util.Scanner;


public class Boletin03_3 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        float b100,b20,b5,m1,total;
        
        System.out.print("Billetes de 100€: ");
        b100=sc.nextFloat();
        System.out.print("Billetes de 20€: ");
        b20=sc.nextFloat();
        System.out.print("Billetes de 5€: ");
        b5=sc.nextFloat();
        System.out.print("Monedas de 1€: ");
        m1=sc.nextFloat();
        
        total=b100*100+b20*20+b5*5+m1;
        
        System.out.println("El total es: "+total);
        
        
        
        
    }
    
}
