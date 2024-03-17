public class Circulo extends FiguraGeometrica{
    private Double radio, resultado;

    public Circulo(Double radio){
        this.radio=radio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }
}
