import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Operacions<Integer> operaciones = new Operacions<>();
        List<Integer> lista = new ArrayList<>();
        for (int i=0; i<14; i++){
            lista.add(i);
        }

        System.out.println("Mínimo: "+operaciones.minimo(lista));
        System.out.println("Máximo: "+operaciones.maximo(lista));
        System.out.println("Posición: "+operaciones.buscarObjeto(lista, 9));

        System.out.println("Elemento eliminado: "+operaciones.eliminarObjecto(lista, 9));
        System.out.println("No aparece en la lista: "+operaciones.buscarObjeto(lista,9));
    }
}
