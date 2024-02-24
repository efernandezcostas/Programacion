package aplicacion;

public class Libro {
    private String titulo, autor, ISBN;
    private int numeroUnidades=0;
    private float prezo;

    Libro(String titulo, String autor, String ISBN, float prezo){
        this.titulo=titulo;
        this.autor=autor;
        this.ISBN=ISBN;
        this.prezo=prezo;
        numeroUnidades++;
    }

    public String getTitulo(){
        return titulo;
    }

    public float getPrezo(){
        return prezo;
    }

    public int getNumeroUnidades(){
        return numeroUnidades;
    }

    public void baixarCantidade(){
        numeroUnidades--;
    }
    public void subirCantidade(){
        numeroUnidades++;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", numeroUnidades=" + numeroUnidades +
                ", prezo=" + prezo +
                '}';
    }
}
