
package boletinextra01_2;

import java.util.Scanner;


public class BoletinExtra01_2 {

    
    public static void main(String[] args) {
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