
package boletin07_5;

import java.util.Scanner;


public class Calculos {
    
    
    
    public void verMayor(){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Escribe el 1er número: ");
        int num1 = sc.nextInt();
        System.out.print("Escribe el 2º número: ");        
        int num2 = sc.nextInt();
        System.out.print("Escribe el 3er número: ");        
        int num3 = sc.nextInt();
        
        if (num1>num2 && num1>num3){
            System.out.println(num1+" es el mayor.");
        }else if (num2>num1 && num2>num3){
            System.out.println(num2+" es el mayor.");
        }else if (num3>num1 && num3>num2){
            System.out.println(num3+" es el mayor.");
        }else{
            System.out.println("Son iguales.");
        }
        
    }
    
}
