
package boletin07_1;

import java.util.Scanner;


public class Boletin07_1 {


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        Positivo obx1=new Positivo();
        
        System.out.print("Teclea un número entero: ");
        obx1.verPositivo(sc.nextInt());

    }
    
}
