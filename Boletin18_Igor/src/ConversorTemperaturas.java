public class ConversorTemperaturas {

    private static final int TEMP = 80;

    ConversorTemperaturas(){
    }

    static float centigradosToFahrenheit (float centigrados) throws TemperaturaErradaException{
        if (centigrados < TEMP){
            TemperaturaErradaException miExcepcion = new TemperaturaErradaException("La máquina no puede trabajar con menos de 80ºC");
            throw miExcepcion;
        }
        float fahrenheit = (9/5)*centigrados+32.4f;
        return fahrenheit;
    }

    static float centigradosToReamur (float centigrados) throws TemperaturaErradaException{
        if (centigrados < TEMP){
            TemperaturaErradaException miExcepcion = new TemperaturaErradaException("La máquina no puede trabajar con menos de 80ºC");
            throw miExcepcion;
        }
        float reamur = (4/5)*centigrados;
        return reamur;
    }
}
