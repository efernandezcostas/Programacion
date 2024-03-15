import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Libros libros = new Libros();
        int opcion=0;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                        Escolle unha opción:
                            1. Engadir libro 
                            2. Consultar prezo libro
                            3. Amosar ficheiros
                            4. Eliminar libros sen unidades
                            5. Vender Libro
                            6. Cambiar prezo libro
                            7. Abandoar
                            """));
            } catch (Exception e) {
                System.out.println();
            } finally {
                switch (opcion) {
                    case 1:
                        libros.engadirLibro(JOptionPane.showInputDialog("Nome do libro"), JOptionPane.showInputDialog("Autor do libro"), Float.parseFloat(JOptionPane.showInputDialog("Prezo do libro")));
                        break;
                    case 2:
                        libros.consultarPrezoLibro(JOptionPane.showInputDialog("Nome do libro"));
                        break;
                    case 3:
                        libros.amosarFicheiro();
                        break;
                    case 4:
                        libros.eliminarLibrosSenUnidades();
                        break;
                    case 5:
                        libros.venderLibro(JOptionPane.showInputDialog("Nome do libro"));
                        break;
                    case 6:
                        libros.cambiarPrecioLibro(JOptionPane.showInputDialog("Nome do libro"), Float.parseFloat(JOptionPane.showInputDialog("Novo prezo")));
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Saíndo..");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción non recoñecida");
                }
            }
        }while (opcion != 7);
    }
}