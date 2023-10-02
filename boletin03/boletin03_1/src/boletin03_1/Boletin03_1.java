/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin03_1;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin03_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        
        float prezoPagado,prezoTarifa,desconto;
        
        System.out.print("Prezo tarifa: ");
        prezoTarifa = sc.nextFloat();
        
        System.out.print("Prezo pagado: ");
        prezoPagado = sc.nextFloat();
        
        desconto=100-((100*prezoPagado)/prezoTarifa);
        
        System.out.println("El desconto es: "+desconto+"%");
        
        
    }
    
}
