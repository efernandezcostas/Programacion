/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin17;

/**
 *
 * @author dam1
 */
public class Boletin17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persoa pers1 = new Persoa ("Quique", "Fdez", "14131211A");
        CuentaCorriente contc1 = new CuentaCorriente(pers1, 11111111);
        System.out.println(contc1.getSaldo());
        
        Persoa pers2 = new Persoa ("Kiks", "Fdez", "12111211B");
        CuentaAhorro conta1 = new CuentaAhorro(pers2, 22222222, 1.5f);
        System.out.println(conta1.getSaldo());
        
        CuentaAhorro conta2= new CuentaAhorro(new Persoa("Enrique", "Fdez", "11111819C"), 33333333, 1f);
        
        System.out.println(conta2.getSaldo());
        
        conta2.ingresar(1200);
        System.out.println(conta2.getSaldo());
        
        conta2.retirar(1000);
        System.out.println(conta2.getSaldo());
        
        conta2.retirar(4000);
        System.out.println(conta2.getSaldo());
        
        
    }
    
}
