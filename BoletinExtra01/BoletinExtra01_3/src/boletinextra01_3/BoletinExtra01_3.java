
package boletinextra01_3;


public class BoletinExtra01_3 {

    
    public static void main(String[] args) {
        float precioPantalon=90,rebaixa=0.25f,preciofinal;
        
        preciofinal=precioPantalon-(precioPantalon*rebaixa);
        System.out.print("Precio final: "+preciofinal+"€");
    }
    
}