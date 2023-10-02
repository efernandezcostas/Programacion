/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin02_4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin02_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        
        float num1,num2,suma,resta,producto,cociente;
        
        System.out.print("num1: ");
        num1 = sc.nextFloat();
        System.out.print("num2: ");
        num2 = sc.nextFloat();
        
        System.out.println("Suma: "+(num1+num2));
        System.out.println("Resta: "+(num1-num2));
        System.out.println("Producto: "+(num1*num2));
        System.out.println("Cociente: "+(num1/num2));
        
    }
    
}
