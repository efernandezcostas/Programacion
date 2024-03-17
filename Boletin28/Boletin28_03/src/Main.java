public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(10d);
        System.out.println("Área del círculo: "+circulo.calcularArea());

        Rectangulo rectangulo = new Rectangulo(10d, 20d);
        System.out.println("Área del recángulo: "+rectangulo.calcularArea());
    }
}
