public class App {
    public static void main(String[] args) {
        NotasClase notas = new NotasClase();
        notas.llenarNotas();
        System.out.println();

        notas.calcularMedio();
        notas.notaMasAlta();
    }
}

class NotasClase{

    private int [] notasClase = new int[30];

    void llenarNotas(){
        for (int i=0; i<notasClase.length; i++){
            notasClase[i]= (int) (Math.round(Math.random()*10));
        }
    }

    void calcularMedio(){
        int total=0;
        for (int i=0; i<notasClase.length; i++){
            total+=notasClase[i];
        }
        System.out.println("Media: "+(double)total/notasClase.length);
    }

    void notaMasAlta(){
        int mayor=0;
        int cantidad=0;
        for (int i=0; i<notasClase.length; i++){
            if(notasClase[i]>mayor){
                mayor=notasClase[i];
                cantidad=1;
            }
            if(notasClase[i]==mayor){
                cantidad++;
            }
        }
        System.out.println("Nota mayor: "+mayor+"\nCantidad: "+cantidad);
    }

}