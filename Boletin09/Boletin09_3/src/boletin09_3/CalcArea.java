
package boletin09_3;

import java.util.Scanner;

public class CalcArea {
    
    Scanner sc = new Scanner (System.in);
    
    public void calcularArea(){
        
        System.out.print("Escribe la base del triángulo: ");
        double base=sc.nextDouble();
        
        while (base<=0){
            System.out.print("La base es negativa, escribe un número positivo: ");
            base=sc.nextDouble();
        }
        
        System.out.print("Escribe a altura del triángulo: ");
        double altura=sc.nextDouble();
        
        while (altura<=0){
            System.out.print("La altura es negativa, escribe un número positivo: ");
            altura=sc.nextDouble();
        }
        
        System.out.println("El área del triángulo es: "+((base*altura)/2));
        
    }
    
}
