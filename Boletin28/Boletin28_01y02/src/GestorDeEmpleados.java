import java.util.ArrayList;
import java.util.List;

public class GestorDeEmpleados {
    private static List <Empleado> listaEmpleados = new ArrayList<>();

    public static void agregarEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
    }

    public static void mostrarEmpleados(){
        for (Empleado ele:listaEmpleados){
            System.out.println(ele.getNombre_empleado()+", "+ele.getDepartamento_empleado()+", "+ele.getSalario_empleado());
        }
    }

    public static void buscarEmpleadoPorNombre(String nombre){
        for (Empleado ele:listaEmpleados){
            if (ele.getNombre_empleado().equals(nombre)){
                System.out.println(ele.getNombre_empleado()+", "+ele.getDepartamento_empleado()+", "+ele.getSalario_empleado());
            }
        }
    }
}
