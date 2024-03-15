import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

public class Libros {
    private String nome_libro,autor_libro;
    private Float precio_libro;
    private int unidades_libro=0;
    private List<Libros> listaLibros = new ArrayList<>();

    public Libros(){

    }

    public Libros(String nome_libro, String autor_libro, Float precio_libro){
        this.nome_libro=nome_libro;
        this.autor_libro=autor_libro;
        this.precio_libro=precio_libro;
        unidades_libro++;
    }

    public void engadirLibro(String nome_libro, String autor_libro, Float precio_libro){
        boolean libro_ya_incluido=false;
        for (Libros ele:listaLibros){
            if (nome_libro.equals(ele.nome_libro)){
                libro_ya_incluido=true;
                ele.unidades_libro++;
                break;
            }
        }
        if (!libro_ya_incluido){
            listaLibros.add(new Libros(nome_libro,autor_libro,precio_libro));

        }
    }

    public void consultarPrezoLibro(String nome_libro){
        boolean libro_ya_incluido=false;
        Float precio=0f;
        for (Libros ele:listaLibros){
            if (nome_libro.equals(ele.nome_libro)){
                libro_ya_incluido=true;
                precio=ele.precio_libro;
                break;
            }
        }

        if (!libro_ya_incluido){
            JOptionPane.showMessageDialog(null,"O libro non está na librería");
        }else{
            JOptionPane.showMessageDialog(null,"O precio é "+precio);
        }
    }

    public void amosarFicheiro(){
        String lista="";
        for (Libros ele:listaLibros){
            lista=lista+ele.nome_libro+", "+ele.autor_libro+", "+ele.precio_libro+", "+ele.unidades_libro+"\n";
        }
        JOptionPane.showMessageDialog(null,lista);
    }

    public void eliminarLibrosSenUnidades(){
        for (Libros ele:listaLibros){
            if (ele.unidades_libro==0){
                listaLibros.remove(ele);
            }
        }
    }

    public void venderLibro(String nome_libro){
        for (Libros ele:listaLibros){
            if (nome_libro.equals(ele.nome_libro)){
                if (ele.unidades_libro<=0){
                    JOptionPane.showMessageDialog(null,"No quedan unidades");
                }
                else{
                    ele.unidades_libro--;
                }
                break;
            }
        }
    }

    public void cambiarPrecioLibro(String nome_libro, Float precio_libro){
        for (Libros ele:listaLibros){
            if (nome_libro.equals(ele.nome_libro)){

            }
        }
    }
}
