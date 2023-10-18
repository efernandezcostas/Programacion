
package boletin03_2;

import java.util.Scanner;


public class Boletin03_2 {


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        float gradosc;
        
        System.out.print("Cantidad de grados centígrados: ");
        gradosc=sc.nextFloat();
        
        final float CAMBIOCF=((gradosc*9/5)+32), CAMBIOCK=gradosc+273.15f;
    
        System.out.println(gradosc+"ºC son "+CAMBIOCF+" grados Fahrenheit y "+CAMBIOCK+" grados Kelvin.");
        
    }
    
}
