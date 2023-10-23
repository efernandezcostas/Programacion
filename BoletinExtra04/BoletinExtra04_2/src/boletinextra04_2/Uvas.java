
package boletinextra04_2;

public class Uvas {
    
    private double precioInicial;
    private double precioFinal;
    private double kilos;
    private char tipo;
    private byte tamano;

    
    public void setPrecioInicial(double precio1){
        precioInicial=precio1;
    }
    
    public void setTipo(char tipo1){
        tipo=tipo1;
    }
    
    public void setTamano(byte tamano1){
        tamano=tamano1;
    }
    
    public void setKilos(double kilos){
        this.kilos=kilos;
    }
    
    public void calcularPrecio(){
     
        if (tipo=='A' || tipo=='a'){
            if (tamano==1){
                precioFinal=precioInicial+0.20;
                System.out.println("El precio sin cambios es "+(precioInicial*kilos));
                System.out.println("El precio con cambios es "+(precioFinal*kilos));
            }
            else if (tamano==2){
                precioFinal=precioInicial+0.30;
                System.out.println("El precio sin cambios es "+(precioInicial*kilos));
                System.out.println("El precio con cambios es "+(precioFinal*kilos));
            }
            else{
                System.out.println("Tamaño incorrecto.");
            }
        }
        else if (tipo=='B' || tipo=='b'){
            if (tamano==1){
                precioFinal=precioInicial-0.30;
                System.out.println("El precio sin cambios es "+(precioInicial*kilos));
                System.out.println("El precio con cambios es "+(precioFinal*kilos));
            }
            else if (tamano==2){
                precioFinal=precioInicial-0.50;
                System.out.println("El precio sin cambios es "+(precioInicial*kilos));
                System.out.println("El precio con cambios es "+(precioFinal*kilos));
            }
            else{
                System.out.println("Tamaño incorrecto.");
            }
        } 
        else{
            System.out.println("Tipo incorrecto.");
        }
        

        
        
    }
}
