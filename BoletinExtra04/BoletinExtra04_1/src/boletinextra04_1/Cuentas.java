
package boletinextra04_1;


public class Cuentas {
    
    public void verCantidadNum(int num){
        
        if (num<10){
            System.out.println(num+" tiene 1 cifra.");
        }
        else if(num>=10 && num<100){
            System.out.println(num+" tiene 2 crifas.");
        }
        else if(num>=100 && num<1000){
            System.out.println(num+" tiene 3 cifras.");
        }
        else if(num>=1000 && num<10000){
            System.out.println(num+" tiene 4 cifras.");
        }
        else if(num>=10000 && num<100000){
            System.out.println(num+" tiene 5 cifras.");
        }
        else{
            System.out.println(num+" tiene más de 5 cifras.");
        }
        
    }
    
}
