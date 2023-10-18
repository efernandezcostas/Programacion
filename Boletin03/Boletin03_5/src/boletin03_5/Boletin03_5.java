
package boletin03_5;

import java.util.Scanner;


public class Boletin03_5 {


    public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el salario fijo mensual: ");
        double salarioFijo = scanner.nextDouble();

        System.out.print("Introduce el importe total de ventas: ");
        double ventas = scanner.nextDouble();

        System.out.print("Introduce la cantidad de kilómetros recorridos: ");
        double kms = scanner.nextDouble();

        System.out.print("Introduce la cantidad de días de desplazamiento: ");
        int desplazamiento = scanner.nextInt();

        double comision = ventas * 0.05;
        double salarioKilometraje = kms * 2;
        double dietas = desplazamiento * 30;
        double salarioTotal = salarioFijo + comision + salarioKilometraje + dietas;
        
        double irpf = salarioTotal * 0.18;
        double seguridadSocial = 36.0;
        double salarioNeto = salarioTotal - irpf - seguridadSocial;

        System.out.println("Salario Bruto: " + salarioTotal + " euros");
        System.out.println("Salario Neto: " + salarioNeto + " euros");

    }
    
}
