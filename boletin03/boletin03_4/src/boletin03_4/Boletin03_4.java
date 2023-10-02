
package boletin03_4;

import java.util.Scanner;


public class Boletin03_4 {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        
        float total,b100,restob100,b20,restob20,b5,restob5,m1,restom1;
        
        System.out.print("Cantidad total: ");
        total=sc.nextFloat();
        
        restob100=total%100;
        b100=(total-restob100)/100;
        
        restob20=restob100%20;
        b20=(restob100-restob20)/20;
        
        restob5=restob20%5;
        b5=(restob20-restob5)/5;
        
        restom1=restob5%1;
        m1=(restob5-restom1)/1;
        
        System.out.print("Billetes de 100€: "+(int)b100+"\nBilletes de 20€: "+(int)b20+"\nBilletes de 5€: "+(int)b5+"\nMonedas de 1€: "+(int)m1+"\n");



    }
    
}
