
package boletin11_01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Juego {
    
    Scanner sc=new Scanner(System.in);  
    
    public void crearJuego(){
        
        int numSecreto=Integer.parseInt(JOptionPane.showInputDialog("Jugador 1 escribe un número entre 1 y 50"));
      
        while (numSecreto<1 || numSecreto>50){
            System.out.println("El número secreto debe estar entre 1 y 50");
            numSecreto=Integer.parseInt(JOptionPane.showInputDialog("Jugador 1 escribe un número entre 1 y 50"));
        }  
        
        int numIntentos=Integer.parseInt(JOptionPane.showInputDialog("Jugador 1 escribe número de intentos"));
        int numJ2=0;
        int i=1;
        
        while(numSecreto!=numJ2 && i<=numIntentos){
            System.out.print("Número de jugador 1: ");
            numJ2=sc.nextInt();
            
            if(numJ2>numSecreto){
                System.out.println("El número secreto es menor");
            }else if (numJ2<numSecreto){
                System.out.println("El número secreto es mayor");
            }
            i++;
        }
        
        if (numJ2==numSecreto){
            System.out.println("Has ganado");
        }else{
            System.out.println("Has perdido");
        }
    }  
}
