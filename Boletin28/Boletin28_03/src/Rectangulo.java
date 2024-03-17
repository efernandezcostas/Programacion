public class Rectangulo extends FiguraGeometrica{
    private Double lado, altura;

    public Rectangulo(Double lado, Double altura){
        this.lado=lado;
        this.altura=altura;
    }

    @Override
    public Double calcularArea() {
        return lado*altura;
    }
}
