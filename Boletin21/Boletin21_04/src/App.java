import javax.swing.*;

public class App {
    public static void main(String[] args) {
        CalcularLetraNif miletra = new CalcularLetraNif();
        System.out.println("Letra correspondiente: "+miletra.calcularLetra(Long.parseLong(JOptionPane.showInputDialog("Numero del DNI"))));
    }
}

class CalcularLetraNif{
    String calcularLetra(long nif){
        long letraLong = nif%23;
        int letraInt = (int) letraLong;
        String letra="";
        switch (letraInt) {
            case 3:
                letra = "A";
                break;
            case 11:
                letra = "B";
                break;
            case 20:
                letra = "C";
                break;
            case 9:
                letra = "D";
                break;
            case 22:
                letra = "E";
                break;
            case 7:
                letra = "F";
                break;
            case 4:
                letra = "G";
                break;
            case 18:
                letra = "H";
                break;
            case 13:
                letra = "J";
                break;
            case 21:
                letra = "K";
                break;
            case 19:
                letra = "L";
                break;
            case 5:
                letra = "M";
                break;
            case 12:
                letra = "N";
                break;
            case 8:
                letra = "P";
                break;
            case 16:
                letra = "Q";
                break;
            case 1:
                letra = "R";
                break;
            case 15:
                letra = "S";
                break;
            case 0:
                letra = "T";
                break;
            case 17:
                letra = "V";
                break;
            case 2:
                letra = "";
                break;
            case 10:
                letra = "X";
                break;
            case 6:
                letra = "Y";
                break;
            case 14:
                letra = "Z";
                break;
            default:
                letra = null;
        }
        return letra;
    }
}
