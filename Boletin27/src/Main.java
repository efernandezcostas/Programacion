import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Libreria libreria = new Libreria();
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
                        libreria.engadirLibro(new Libros(JOptionPane.showInputDialog("Nome do libro"), JOptionPane.showInputDialog("Autor do libro"), Float.parseFloat(JOptionPane.showInputDialog("Prezo do libro"))));
                        break;
                    case 2:
                        libreria.consultarLibro(JOptionPane.showInputDialog("Nome do libro"));
                        break;
                    case 3:
                        libreria.amosarFicheiros();
                        break;
                    case 4:
                        libreria.borrarLibrosSenUnidades();
                        break;
                    case 5:
                        libreria.quitarLibro(JOptionPane.showInputDialog("Nome do libro"));
                        break;
                    case 6:
                        libreria.modificarPrezoLibro(JOptionPane.showInputDialog("Nome do libro"), Float.parseFloat(JOptionPane.showInputDialog("Novo prezo")));
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Saíndo..");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción non recoñecida");
                        opcion=0;
                }
            }
        }while (opcion != 7);

    }
}