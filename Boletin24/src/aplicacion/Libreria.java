package aplicacion;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

    private static List<Libro> listaLibros = new ArrayList<Libro>();

    public void engadirLibro(String titulo, String autor, String ISBN, float prezo){
        boolean existente=false;

        for (Libro ele : listaLibros){
            if (ele.getTitulo().equals(titulo)){
                ele.subirCantidade();
                existente=true;
                break;
            }
        }
        if (!existente)     listaLibros.add(new Libro(titulo, autor, ISBN, prezo));
    }

    public void venderLibro(String titulo) throws ArrayNull {
        if (listaLibros.isEmpty()){
            throw new ArrayNull("Error: A lista está vacía");
        }
        for (Libro ele : listaLibros){
            if (ele.getTitulo().equals(titulo)){
                ele.baixarCantidade();
                System.out.println(ele.getTitulo()+" vendido por "+ele.getPrezo()+" €");
            }
        }
    }

    public void amosarLibros() throws ArrayNull {
        if (listaLibros.isEmpty()){
            throw new ArrayNull("Error: A lista está vacía");
        }
        for (Libro ele : listaLibros){
            System.out.println(ele.toString());
        }
    }

    public void darBaixaLibros() throws ArrayNull {
        if (listaLibros.isEmpty()){
            throw new ArrayNull("Error: A lista está vacía");
        }
        for (int i=0; i<listaLibros.size(); i++){
            if (listaLibros.get(i).getNumeroUnidades()==0){
                System.out.println(listaLibros.get(i).getTitulo()+" dado de baja.");
                listaLibros.remove(i);
            }
        }
    }

    public void consultarLibro(String titulo) throws ArrayNull {
        if (listaLibros.isEmpty()){
            throw new ArrayNull("Error: A lista está vacía");
        }
        for (Libro ele : listaLibros){
            if (ele.getTitulo().equals(titulo))     System.out.println(ele.toString());
        }
    }
}