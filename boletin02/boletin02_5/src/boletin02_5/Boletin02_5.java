/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin02_5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin02_5 {

    /**
     * @param args the command line arguments
     */
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
