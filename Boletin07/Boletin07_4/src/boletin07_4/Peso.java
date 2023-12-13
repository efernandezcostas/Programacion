
package boletin07_4;

public class Peso {
    
    private String persona1, persona2;
    
    public void verPeso(String nombre1,float peso1, String nombre2, float peso2){
        
        persona1=nombre1;
        persona2=nombre2;
        
        if (peso1>peso2){
            System.out.println(persona1+ " pesa "+(peso1-peso2)+" kg más.");
        }
        else if (peso1<peso2){
            System.out.println(persona2+" pesa "+(peso2-peso1)+" kg más.");
        }
        else{
            System.out.println(persona1+" y "+persona2+" pesan lo mismo.");
        }
        
    }
    
}
