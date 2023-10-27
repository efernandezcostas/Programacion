
package boletin08_2;

import java.util.Scanner;


public class Calculos {
    
    Scanner sc=new Scanner(System.in);
    
    private float lado;
    
    
    public void calcularSuperficie(){
        
        System.out.print("1->Cuadrado\n2->Triángulo\n3->Círculo\nEscribe de que figura quieres saber la superficie: ");
        byte figura=sc.nextByte();
        
        switch (figura){
            
            case 1:     //Cuadrado
                System.out.print("Lado: ");
                float lado=sc.nextFloat();
                
                System.out.println("La superficie del cuadrado es: "+(Math.pow(lado, 2)));
                break;
                
            case 2:     //Triángulo
                System.out.print("Base: ");
                float base=sc.nextFloat();
                System.out.print("Altura: ");
                float altura=sc.nextFloat();
                
                System.out.println("La superficie del triángulo es: "+((base*altura)/2));
                break;
                
            case 3:     //Círculo
                System.out.print("Radio: ");
                float radio=sc.nextFloat();
                
                System.out.println("La superficie del círculo es: "+(Math.PI*Math.pow(radio, 2)));
                break;
                
            default: 
                System.out.println("No es una figura.");
                break;
        }
        
    }
    /*
    public void setLado(float lado){
        this.lado=lado;
    }
    */
}
