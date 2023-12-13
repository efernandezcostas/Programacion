
package boletin09_5;

import javax.swing.JOptionPane;


public class Sueldos {
    
    public void calcularSueldo(){
        
            int trabajadores = 0;
            double salario;
            int i = 0;
            int j = 0;


            do {
                salario =Double.parseDouble(JOptionPane.showInputDialog("Introduzca salario del trabajador. Si no hay más teclee 0."));
                if (salario > 0) {
                    trabajadores++;
                    if (salario >= 1000 && salario <= 1750) {
                        i++;
                    } else if (salario < 1000) {
                        j++;
                    }
                }
            } while (salario != 0);

            float porcentaje = (float) j / trabajadores * 100;

            System.out.println("Trabajadores que ganan entre 1000 y 1750 €: " + i);
            System.out.println("Trabajadores que ganan menos de 1000 € en porcentaje: " + porcentaje + "%");
    }
    
    
}
