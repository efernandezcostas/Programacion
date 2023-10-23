
package boletinextra04_3;

import java.util.Scanner;


public class BoletinExtra04_3 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        Autobus obj1=new Autobus();
        System.out.print("Número de alumnos: ");
        obj1.calcularPrecio(sc.nextInt());
        
    }
    
}
