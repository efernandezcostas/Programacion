/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletinextra02_1;

/**
 *
 * @author dam1
 */
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
