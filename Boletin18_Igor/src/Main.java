public class Main {
    public static void main(String[] args) {

        try {

        } catch (TemperaturaErradaException e) {

        }finally{
            
        }
    }

    static void calcularTemperatura() throws TemperaturaErradaException{
        System.out.println(ConversorTemperaturas.centigradosToFahrenheit(70));
        System.out.println(ConversorTemperaturas.centigradosToFahrenheit(80));
        System.out.println(ConversorTemperaturas.centigradosToFahrenheit(90));

        System.out.println(ConversorTemperaturas.centigradosToReamur(70));
        System.out.println(ConversorTemperaturas.centigradosToReamur(80));
        System.out.println(ConversorTemperaturas.centigradosToReamur(90));
    }
}


