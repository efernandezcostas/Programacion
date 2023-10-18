
package boletinextra01_1;

import java.util.Scanner;


public class BoletinExtra01_1 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        String nome,nacemento;
        
        System.out.print("Escribe o teu nome: ");
        nome=sc.nextLine();
        
        System.out.print("Escribe a tua data de nacemento: ");
        nacemento=sc.nextLine();
        
        System.out.println("nome: "+nome+"\nnacemento: "+nacemento);
    }
    
}