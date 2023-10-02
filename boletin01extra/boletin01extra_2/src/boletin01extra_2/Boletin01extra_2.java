/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin01extra_2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin01extra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        String nomeMateria;
        float nota1,nota2,media;
        
        System.out.print("Escribe o nome da materia: ");
        nomeMateria = sc.nextLine();
        System.out.print("Escribe a nota primer parcial: ");
        nota1=sc.nextFloat();
        System.out.print("Escribe a nota segundo parcial: ");
        nota2=sc.nextFloat();
        
        media=(nota1+nota2)/2;
        
        System.out.println("Materia: "+nomeMateria);
        System.out.println("Parcial 1: "+nota1);
        System.out.println("Parcial 2: "+nota2);
        System.out.println("Nota media: "+media);
        
        
        
    }
    
}
