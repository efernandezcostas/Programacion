
package boletinextra02_2;

public class Ecuacion {
    
    private double nA;
    private double nB;
    private double nC;
    
    public Ecuacion(){
    }
    
    public void setNA(double num){
        nA=num;
    }
    
    public void setNB(double num){
        nB=num;
    }
    
    public void setNC(double nC){
        this.nC=nC;
    }
    
    public void getEcuacion(){
        double resultado1= (-nB+(Math.sqrt(Math.pow(nB, 2)-4*nA*nC)))/(2*nA);
        double resultado2= (-nB-(Math.sqrt(Math.pow(nB, 2)-4*nA*nC)))/(2*nA);
        System.out.println("Os resultados son: "+resultado1+" e "+resultado2+".");
    }

    
}