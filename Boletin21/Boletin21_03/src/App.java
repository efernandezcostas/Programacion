import javax.swing.*;

public class App {
    public static void main(String[] args) {
        NotasClase notas = new NotasClase();
        notas.llenarNotas();

        System.out.println();
        notas.calcularMedio();
        notas.notaMasAlta();

        System.out.println();
        notas.alumnosAprobados();

        System.out.println();
        notas.alumnoEspecifico(JOptionPane.showInputDialog("Nombre del alumno (El único diferente es Paco)"));

        System.out.println();
        notas.ordenCreciente();
    }
}

class NotasClase{

    private String [][] notasClase = new String[30][2];

    void llenarNotas(){
        for (int i=0; i<29; i++){
            for (int j=0; j<2; j++) {
                if (j==0){
                    notasClase[i][j]="Pepe";
                }
                if (j==1){
                    notasClase[i][j] = ""+(Math.round(Math.random()*10));
                }
            }
        }
        notasClase[29][0]="Paco";
        notasClase[29][1]="5";
    }

    void calcularMedio(){
        int total=0;
        for (int i=0; i<30; i++) {
            total+=(Integer.parseInt(notasClase[i][1]));
        }
        System.out.println("Media: "+(double)total/30);
    }

    void notaMasAlta(){
        int mayor=0;
        int cantidad=0;

        for (int i=0; i<30; i++) {
            if((Integer.parseInt(notasClase[i][1])>mayor)){
                mayor=Integer.parseInt(notasClase[i][1]);
                cantidad=1;
            }
            if(Integer.parseInt(notasClase[i][1])==mayor){
                cantidad++;
            }
        }


        for (int i=0; i<30; i++){
            if(Integer.parseInt(notasClase[i][1])>mayor){
                mayor=Integer.parseInt(notasClase[i][1]);
                cantidad=1;
            }
            if(Integer.parseInt(notasClase[i][1])==mayor){
                cantidad++;
            }
        }
        System.out.println("Nota mayor: "+mayor+"\nCantidad: "+cantidad);
    }

    void alumnosAprobados(){
        for (int i=0; i<30; i++){
            if (Integer.parseInt(notasClase[i][1])>=5){
                System.out.println("Alumno: "+notasClase[i][0]+"\t/\tNota: "+notasClase[i][1]);
            }
        }
    }

    void alumnoEspecifico(String nombre){
        for (int i=0; i<30; i++){
            if (notasClase[i][0].equals(nombre)){
                System.out.println("Alumno: "+notasClase[i][0]+"\t/\tNota: "+notasClase[i][1]);
            }
        }
    }

    void ordenCreciente(){
        int total=0;
        int indexNuevo=0;

        String [][] listaCreciente = new String[30][2];

        while (listaCreciente[29][1] == null) {
            for (int i = 0; i < 30; i++) {
                if (Integer.parseInt(notasClase[i][1]) == total) {
                    listaCreciente[indexNuevo][0] = notasClase[i][0];
                    listaCreciente[indexNuevo][1] = notasClase[i][1];
                    indexNuevo++;
                }
            }
            total++;
        }

        for(int i=0; i<30; i++){
            System.out.println("Alumno: "+listaCreciente[i][0]+"\t/\tNota: "+listaCreciente[i][1]);
        }
    }
}