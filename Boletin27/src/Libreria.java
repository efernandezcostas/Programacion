import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<Libros> listaLibros = new ArrayList<>();

    public void engadirLibro(Libros libro){
        boolean libro_ya_incluido=false;
        for (Libros ele:listaLibros){
            if (ele==libro){
                libro_ya_incluido=true;
                ele.sumarUnidades_libro();
                break;
            }
        }
        if (!libro_ya_incluido) {
            listaLibros.add(libro);
        }
    }

    public String consultarLibro(String titulo){
        for (Libros ele:listaLibros){
            if (ele.getNome_libro().equals(titulo)){
                return ele.getNome_libro()+" -> Prezo: "+ele.getPrecio_libro();
            }
        }
        return "O libro non está na librería";
    }

    public void amosarFicheiros(){
        for (Libros ele:listaLibros){
            System.out.println("Nome: "+ele.getNome_libro()+"\nAutor: "+ele.getAutor_libro()+"\nPrezo: "+ele.getPrecio_libro()+"\nUnidades: "+ele.getUnidades_libro());
        }
    }

    public void borrarLibrosSenUnidades(){
        listaLibros.removeIf(ele -> ele.getUnidades_libro()<=0);
    }

    public void quitarLibro(String titulo){
        boolean libro_encontrado=false;
        for (Libros ele:listaLibros){
            if (ele.getNome_libro().equals(titulo)){
                libro_encontrado=true;
                ele.restarUnidades_libro();
                break;
            }
        }
        if (!libro_encontrado) System.out.println("El libro no está en la librería.");
    }

    public void modificarPrezoLibro(String titulo, Float precio){
        for (Libros ele:listaLibros){
            if (ele.getNome_libro().equals(titulo)){
                ele.setPrecio_libro(precio);
            }
        }
    }
}
