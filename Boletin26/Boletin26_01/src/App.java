import java.util.List;

public class App{
    public static void main(String[] args) {
        Operacions<Integer> operacions = new Operacions<>();
        List<Integer> lista = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);

        System.out.println("Mínimo: "+operacions.minimo(lista));
        System.out.println("Máximo: "+operacions.maximo(lista));
        System.out.println("Posición: "+operacions.buscarObjeto(lista, 9));
        System.out.println("No aparece en la lista: "+operacions.buscarObjeto(lista, 20));
    }
}