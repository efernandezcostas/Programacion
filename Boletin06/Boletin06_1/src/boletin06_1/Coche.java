
package boletin06_1;

import javax.swing.JOptionPane;


public class Coche {
    
    private int velocidade;
    
    public Coche(){
        velocidade=0;
    }
    
    public int getVelocidade(){
        return velocidade;
    }
    
    public void acelerar (int valor){
        velocidade+=valor;
    }
    
    public void frenar (int menos){
        velocidade-=menos;
    }
    
    
}
