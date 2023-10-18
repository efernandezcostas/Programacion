
package boletin02_2;

import java.util.Scanner;


public class Boletin02_2 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        float lado,area,area2;
        System.out.print("lado: ");
        lado = sc.nextFloat();
        
        area=lado*lado;
        System.out.println("Área del cuadrado = "+area);
        
        area2=(float) Math.pow(lado, 2);
        System.out.println("Area2 = "+area2);
        
        System.out.println("Area3 = "+(Math.pow(lado, 2)));
        
    }
    
}