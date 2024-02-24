package lanzador;

import aplicacion.*;
import javax.swing.*;

public class App {
    public static void main(String[] args) {
        Libreria miLibreria = new Libreria();

        int opcion=0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                    (1) Engadir libro.
                    (2) Vender libro
                    (3) Consultar libro
                    (4) Amosar libros
                    (5) Dar de baixa libros sen unidades
                    (6) Salir"""));
            if (opcion==1)          miLibreria.engadirLibro(JOptionPane.showInputDialog("Título"), JOptionPane.showInputDialog("Autor"), JOptionPane.showInputDialog("ISBN"), Float.parseFloat(JOptionPane.showInputDialog("Prezo")));
            else if (opcion==2) {
                try {
                    miLibreria.venderLibro(JOptionPane.showInputDialog("Título"));
                } catch (ArrayNull e) {
                    JOptionPane.showMessageDialog(null, "Error: A lista está vacía");
                }
            }
            else if (opcion==3) {
                try {
                    miLibreria.consultarLibro(JOptionPane.showInputDialog("Título"));
                } catch (ArrayNull e) {
                    JOptionPane.showMessageDialog(null, "Error: A lista está vacía");
                }
            }
            else if (opcion==4) {
                try {
                    miLibreria.amosarLibros();
                } catch (ArrayNull e) {
                    JOptionPane.showMessageDialog(null, "Error: A lista está vacía");
                }
            }
            else if (opcion==5) {
                try {
                    miLibreria.darBaixaLibros();
                } catch (ArrayNull e) {
                    JOptionPane.showMessageDialog(null, "Error: A lista está vacía");
                }
            }
            else if (opcion!=6)     JOptionPane.showMessageDialog(null,"Opción no reconocida");
        }while(opcion!=6);
    }
}
