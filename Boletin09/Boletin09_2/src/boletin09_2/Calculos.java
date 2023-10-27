
package boletin09_2;


public class Calculos {
    
    private int suma=0;
    private double produto=1;
    
    public void calcSumPro(){
        
        int i=11;
        while (i<90){
            suma+=+i;
            produto=produto*i;
            i++;
        }
        System.out.println("A suma é "+suma);
        System.out.println("O produto é "+produto);   
    }
    
}
