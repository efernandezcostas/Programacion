
package boletin18_1;

import javax.swing.JOptionPane;


public class Llamada {
    
    private double prezo;
    private double prezofinal;
    private int tempo;
    private int dia;
    
    public void precioLlamada(){
        
        int programa;
        
        do{    
            programa=Integer.parseInt(JOptionPane.showInputDialog("Quiere continuar ejecutando el prorgama?: \n1.Si \n2.No"));
            
            if(programa==1){
            tempo=Integer.parseInt(JOptionPane.showInputDialog("Duración de la llamada (en minutos)"));
            
            if(tempo<=5){
            prezo=1;
            }
            
            else if(tempo>5&&tempo<=8){
               prezo=1.8; 
            }
        
            else if(tempo>8&&tempo<=10){
               prezo=2.5;
            }
            
            else if(tempo>10){
               prezo=2.5+((tempo-10)*0.5); 
            }
        
        
            dia=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una \n 1.De lunes a sábado por la mañana \n 2.De lunes a sábado por la tarde \n 3.Domingo"));

            switch(dia){

                case 1:
                prezofinal=prezo+prezo*0.15;
                    break; 
                case 2:
                prezofinal=prezo+prezo*0.10;
                    break;
                case 3:
                prezofinal=prezo+prezo*0.03;
                    break;

                default:
                    System.out.println("Opción inválida");
            }

            JOptionPane.showMessageDialog(null, "Duración da llamada: "+tempo+" minutos"+"\nPrecio final de la llamada: " +prezofinal+"€");
            }
            
        }while(programa==1);  
    }
    
}
