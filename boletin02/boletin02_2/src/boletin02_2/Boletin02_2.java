/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin02_2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin02_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
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
