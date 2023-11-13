
package boletin09_4;

import java.util.Scanner;

public class CalcularTabla {
    
    Scanner sc=new Scanner(System.in);
    
    public void TablaMultiplicar(){
        
        int i = 1;        
        
        System.out.print("Escribe el número del que quieres saber la tabla de multiplicar: ");
        int num=sc.nextInt();

        if (num>0){
            
            while (i<=10){
               System.out.println(num+"*"+i+" = "+num*i);
               i++;
               
            }      
        } 
    }   
}
