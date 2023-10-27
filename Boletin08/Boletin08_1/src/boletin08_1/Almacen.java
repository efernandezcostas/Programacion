
package boletin08_1;

import java.util.Scanner;


public class Almacen {
    
    Scanner sc = new Scanner (System.in);
    
    public void numVentas(){
        
        System.out.print("Nombre del artículo: ");
        String articulo=sc.nextLine();
        
        System.out.print("Número de ventas: ");
        int ventas=sc.nextInt();
        
        
        if (ventas <= 100){
            System.out.println("El articulo "+articulo+" es de bajo consumo");
        }else if (ventas <=500){
            System.out.println("El articulo "+articulo+" es de medio consumo");
        }else if (ventas <=1000){
            System.out.println("El articulo "+articulo+" es de alto consumo");
        }else{
            System.out.println("El articulo "+articulo+" es de primera necesidad");
        }       
    }
}