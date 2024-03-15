public class Main {
    public static void main(String[] args) {
        GestorDeEmpleados.agregarEmpleado(new Empleado("Pepe","Calle",20f));
        GestorDeEmpleados.agregarEmpleado(new Empleado("Pepa","Colle",19f));

        System.out.println("\nMostrar empleados:");
        GestorDeEmpleados.mostrarEmpleados();

        System.out.println("\nBuscar empleados por nombre:");
        GestorDeEmpleados.buscarEmpleadoPorNombre("Pepa");

        System.out.println("\nUso de caja:");
        Caja<Integer> cajaInt = new Caja<>();
        cajaInt.agregar(21);
        System.out.println(cajaInt.obtener());

        Caja<String> cajaString = new Caja<>();
        cajaString.agregar("Huuola");
        System.out.println(cajaString.obtener());

        Caja<Empleado> cajaEmpleado = new Caja<>();
        cajaEmpleado.agregar(new Empleado("Nombre", "Departamento", 10000f));
        System.out.println(cajaEmpleado.obtener());
    }
}
