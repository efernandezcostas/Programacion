import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<Libros> listaLibros = new ArrayList<>();
    Libros libro;

    public void engadirLibro(Libros libro){
        libro=this.encontrar_libro(libro);
        if(libro!=null)       libro.sumarUnidades_libro();
        else                  listaLibros.add(libro);
    }

    public void consultarLibro(String titulo){
        libro=this.encontrar_libro(titulo);
        if(libro!=null)      System.out.println(libro.getNome_libro()+" -> Prezo: "+libro.getPrecio_libro());
        else                 System.out.println("Libro non atopado");
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
        libro=this.encontrar_libro(titulo);
        if (libro!=null)    libro.restarUnidades_libro();
        else                System.out.println("Libro non atopado");
    }

    public void modificarPrezoLibro(String titulo, Float precio){
        libro=this.encontrar_libro(titulo);
        if (libro!=null)     libro.setPrecio_libro(precio);
        else                 System.out.println("Libro non atopado");
    }

    private Libros encontrar_libro(String titulo){
        for (Libros ele:listaLibros){
            if (ele.getNome_libro().equals(titulo))     return ele;
        }
        return null;
    }

    private Libros encontrar_libro(Libros libro){
        for (Libros ele:listaLibros){
            if (ele==libro)     return ele;
        }
        return null;
    }
}
