class ConversorTemperaturas {
    static final int TEMPERATURA_MINIMA = 80;

    public float centigradosToFahrenheit(float centigrados) throws TemperaturaErradaException{
        if (centigrados < TEMPERATURA_MINIMA){
            throw new TemperaturaErradaException("La temperatura mínima debe ser 80ºC.");
        }
        return 9f/5f*centigrados+32.4f;
    }

    public float centigradosToReamur (float centigrados) throws TemperaturaErradaException{
        if (centigrados < TEMPERATURA_MINIMA){
            throw new TemperaturaErradaException("La temperatura mínima debe ser 80ºC.");
        }
        return (4f/5f)*centigrados;
    }
}
