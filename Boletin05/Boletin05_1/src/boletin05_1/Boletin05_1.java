
package boletin05_1;

import java.util.Scanner;


public class Boletin05_1 {


	public static void main(String[] args) {
   	 
    	Scanner sc = new Scanner (System.in);
   	 
    	Consumo coche1 = new Consumo();
   	 
    	System.out.print("Kilómetros totales que ten o coche: ");
    	coche1.setKm(sc.nextFloat());
    	System.out.print("Litros totales consumidos polo coche: ");
    	coche1.setLitros(sc.nextFloat());
    	System.out.print("Precio da gasolina: ");
    	coche1.setPGas(sc.nextFloat());
    	System.out.print("Velocidade media: ");
    	coche1.setVMed(sc.nextFloat());
   	 
    	coche1.getTempo();
    	coche1.getConsumoMedio();
    	coche1.getConsumoEuros();
   	 
    	Consumo coche2 = new Consumo(1000,50,120,1.7f);
   	 
    	coche2.getTempo();
    	coche2.getConsumoMedio();
    	coche2.getConsumoEuros();
	}
    
}
