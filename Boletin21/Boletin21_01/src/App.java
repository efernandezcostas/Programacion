public class App {
    public static void main(String[] args) {
        CreaArray array = new CreaArray();
        array.llenarLista();
        array.visualizarAlReves();
    }
}

class CreaArray {
    int[] numeros = new int[6];

    void llenarLista() {
        for (int i=0; i<=5; i++){
            numeros[i]= (int) (Math.random()*49+1);
        }
    }

    void visualizarAlReves(){
        for (int i=5; i>=0; i--){
            System.out.println("index "+i+" --> "+numeros[i]);
        }
    }

}