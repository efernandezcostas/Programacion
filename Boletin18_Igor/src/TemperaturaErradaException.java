import java.io.IOException;

class TemperaturaErradaException extends Exception {
    TemperaturaErradaException(){
    }

    TemperaturaErradaException(String mensajeError){
        super(mensajeError);
    }
}
