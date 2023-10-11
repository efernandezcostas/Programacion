
package boletin06_3;


public class Circulo {
    
    private double radio;
    private final double PI=3.14;
    
    public Circulo(){   
    }
    
    public Circulo(double radio){
        this.radio=radio;
    }
    
    public void setRadio(double radio){
        this.radio=radio;
    }
    
    public void getRadio(){
        System.out.println("O radio é: "+radio);
    }
    
    public void calcularArea(){
        System.out.println("O área é "+(PI*(Math.pow(radio, 2))));
    }
    
    public void calcularLonxitude(){
        System.out.println("A lonxitude é: "+(PI*2*radio));
    }
}
