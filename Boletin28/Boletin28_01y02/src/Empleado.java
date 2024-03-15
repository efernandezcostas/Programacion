public class Empleado {
    private String nombre_empleado, departamento_empleado;
    private Float salario_empleado;

    public Empleado(String nombre_empleado, String departamento_empleado, Float salario_empleado) {
        this.nombre_empleado = nombre_empleado;
        this.departamento_empleado = departamento_empleado;
        this.salario_empleado = salario_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getDepartamento_empleado() {
        return departamento_empleado;
    }

    public void setDepartamento_empleado(String departamento_empleado) {
        this.departamento_empleado = departamento_empleado;
    }

    public Float getSalario_empleado() {
        return salario_empleado;
    }

    public void setSalario_empleado(Float salario_empleado) {
        this.salario_empleado = salario_empleado;
    }
}
