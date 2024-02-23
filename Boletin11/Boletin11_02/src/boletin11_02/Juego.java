
package boletin11_02;

import java.util.Scanner;


public class Juego {

    Scanner sc = new Scanner (System.in);

    public void crearJuego(){
        
        int numSecreto=(int)(Math.random()*49+1);
        int numj2;

        do{
            System.out.print("Escribe un número entre 1 y 50: ");
            numj2=sc.nextInt();
            
            if (numSecreto-numj2>20 || numj2-numSecreto>20){
                System.out.println("Moi lonxe");
            }else if(numSecreto-numj2>10 || numj2-numSecreto>10){
                System.out.println("Lonxe");
            }else if(numSecreto-numj2>5 || numj2-numSecreto>5){
                System.out.println("Preto");
            }else{
                System.out.println("Moi preto");
            }
        }while(numj2!=numSecreto);
        
        System.out.println("Has ganado");
    }
    
}
