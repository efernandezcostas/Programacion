import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ConversorTemperaturas conversor = new ConversorTemperaturas();
        int centigrados = Integer.parseInt(JOptionPane.showInputDialog("Centígrados"));

        try {
            System.out.println(conversor.centigradosToFahrenheit(centigrados));
            System.out.println(conversor.centigradosToReamur(centigrados));
        }catch (TemperaturaErradaException e){
            System.out.println("\nError: "+e.getMessage());
        }
    }
}


