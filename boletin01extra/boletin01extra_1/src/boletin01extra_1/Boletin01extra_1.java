/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin01extra_1;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin01extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        
        String nome,nacemento;
        
        System.out.print("Escribe o teu nome: ");
        nome=sc.nextLine();
        
        System.out.print("Escribe a tua data de nacemento: ");
        nacemento=sc.nextLine();
        
        System.out.println("nome: "+nome+"\nnacemento: "+nacemento);
        
    }
    
}
