
package boletin09_1;

import java.util.Scanner;

public class CantidadeN {
    
    private int numPos;
    private int numNeg;
    private int numCero;
    
    Scanner sc = new Scanner(System.in);
    
    public void contaNum(){
        
        int i=0;
        
        while (i<10){
            
            System.out.print("Escribe un número entero: ");
            int num=sc.nextInt();

            if(num>0){
                numPos++;
            }else if(num<0){
                numNeg++;
            }else{
                numCero++;
            }
            
            i++;
        }
        System.out.println("\nNúmeros positivos: "+numPos);
        System.out.println("Números negativos: "+numNeg);
        System.out.println("Números cero: "+numCero);
    }
    
}
