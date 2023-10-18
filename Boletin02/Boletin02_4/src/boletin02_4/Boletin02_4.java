/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin02_4;

import java.util.Scanner;

public class Boletin02_4 {


    public static void main(String[] args) {

        
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
}
