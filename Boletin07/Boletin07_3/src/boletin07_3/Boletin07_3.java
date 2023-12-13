
package boletin07_3;

import java.util.Scanner;


public class Boletin07_3 {


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        Operacions obx1=new Operacions();
        System.out.print("Escribe un número entero: ");
        obx1.facerOperacions(sc.nextInt());

    }
    
}
