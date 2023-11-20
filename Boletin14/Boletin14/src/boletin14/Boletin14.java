/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin14;

import partes.*;

/**
 *
 * @author dam1
 */
public class Boletin14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ordenador ord1=new Ordenador(new Monitor(27, 300, "Samsung"), new Teclado(120, "Corsair")
                , new Cpu("Intel", 3, 350), 1200);
               
        System.out.println(ord1.toString());
        System.out.println("Precio do ordenador: "+ord1.getPrecio()+" €");
        System.out.println("Marca do teclado: "+ord1.getTe().getMarca());
        System.out.println("Velocidade do procesador: "+ord1.getPro().getVelocidade()+" Ghz");
        
        Teclado tec1=new Teclado(90, "Razer");
        Monitor mon1=new Monitor(24, 120, "Acer");
        Cpu cp1=new Cpu("AMD", 4, 250);
        
        System.out.println("\n");
        
        Ordenador ord2=new Ordenador(mon1, tec1, cp1, 400);
        
        System.out.println(ord2.toString());
        System.out.println("Precio do ordenador: "+ord2.getPrecio()+" €");
        System.out.println("Marca do teclado: "+ord2.getTe().getMarca());
        System.out.println("Velocidade do procesador: "+ord2.getPro().getVelocidade()+" Ghz");
        
    }
    
}
