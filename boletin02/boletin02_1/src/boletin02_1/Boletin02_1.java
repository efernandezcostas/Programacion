
package boletin02_1;

import java.util.Scanner;

public class Boletin02_1 {

    public static void main(String[] args) {
        // pedir datos
        
        Scanner sc = new Scanner (System.in);
        
        float base,altura,area;
        
        System.out.print("base: ");
        base = sc.nextFloat();
        
        System.out.print("altura: ");
        altura = sc.nextFloat();
        
        area=(base*altura)/2;
        System.out.println("Área del triángulo = "+area);
        
    }
    
}
