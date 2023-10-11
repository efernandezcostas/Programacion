/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinextra02_2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class BoletinExtra02_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        
        Ecuacion primera1=new Ecuacion();
        
        System.out.print("Escribe o número A: ");
        primera1.setNA(sc.nextDouble());
        
        System.out.print("Escribe o número B: ");
        primera1.setNB(sc.nextDouble());
        
        System.out.print("Escribe o número C: ");
        primera1.setNC(sc.nextDouble());
        
        primera1.getEcuacion();

        
    }
    
}
