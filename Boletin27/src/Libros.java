public class Libros {
    private String nome_libro, autor_libro;
    private Float precio_libro;
    private Integer unidades_libro=0;

    public Libros(String nome_libro, String autor_libro, Float precio_libro){
        this.nome_libro=nome_libro;
        this.autor_libro=autor_libro;
        this.precio_libro=precio_libro;
        unidades_libro++;
    }

    public String getNome_libro() {
        return nome_libro;
    }

    public String getAutor_libro() {
        return autor_libro;
    }

    public Float getPrecio_libro() {
        return precio_libro;
    }

    public Integer getUnidades_libro() {
        return unidades_libro;
    }

    public void sumarUnidades_libro() {
        unidades_libro++;
    }
    public void restarUnidades_libro() {
        unidades_libro--;
    }

    public void setPrecio_libro(float precio_libro) {
        this.precio_libro = precio_libro;
    }
}
