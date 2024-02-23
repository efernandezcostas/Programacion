
package boletinextra05_1;

import java.util.Scanner;


public class Impresoras {
    
    
    Scanner sc=new Scanner (System.in);
    
    final private float IVA = 0.21f;
    private int precioImpresora = 78;
    private float precioImpresoraIVA = precioImpresora+(precioImpresora*IVA);
    
    public void calculosPago(int numImpresoras,byte formaPago){
        switch (formaPago){
            case 1:         //Efectivo
                System.out.println("Número de impresoras compradas: "+numImpresoras);
                System.out.println("Precio unitario por impresora (mas IVA): "+precioImpresoraIVA);
                System.out.println("Precio total sin descuento: "+numImpresoras*precioImpresoraIVA);
                System.out.println("Forma de pago: Efectivo");
                System.out.println("Descuento realizado: 10%");
                System.out.println("Total a pagar: "+numImpresoras*precioImpresoraIVA);
                break;
            case 2:         //Tarjeta de crédito
                break;
            case 3:         //Vale de regalo
                break;
        }
    }
    
    /*
    
    public void calculosEmpresa(){
        
        
        System.out.print("Número de impresoras compradas: ");
        int numImpresoras=sc.nextInt();
        
        System.out.print("1->Efectivo\n2->Tarjeta de crédito\n3->Vale de regalo\nForma de pago: ");
        int formaPago=sc.nextByte();
        
        switch (formaPago){
            case 1:
                System.out.print("Cantidad de impresoras a comprar: "+numImpresoras+"\nPrezo unitario por impresora (con IVA): "+precioImpresoraIva+"\n"
                        + "Precio total sin descuento: "+numImpresoras*precioImpresoraIva+"\nForma de pago: Efectivo"+"\nDescuento realizado: 10%"+
                                "\nTotal a pagar: "+(numImpresoras*precioImpresoraIva));
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
    }    
        */
    
    
    
    
    
    
}
