
package boletinextra02_1;


public class Calculos {
    
     private final float IVA=0.21f;
    private String nomeProduto;
    private float prezo;
    private float prezoFinal;
    
    public Calculos(){
    }
    
    public void setPrezo(float pr){
        prezo=pr;
    }
    
    public void setNomeProduto (String nom){
        nomeProduto=nom;
    }
    
    public void getPrezoFinal (){
        prezoFinal=prezo+prezo*IVA;
        System.out.print("Nome do produto: "+nomeProduto+"\nPrezo mais IVA: "+prezoFinal+"€.\n");
    }

    
}
