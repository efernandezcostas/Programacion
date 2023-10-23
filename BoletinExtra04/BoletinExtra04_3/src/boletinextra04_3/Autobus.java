
package boletinextra04_3;

public class Autobus {
    
    private int numAlumnos;
    private int precioAlumno;
    
    public void calcularPrecio(int numAlumnos){
        this.numAlumnos=numAlumnos;
        
        if (numAlumnos>=100){
            precioAlumno=65;
        }
        else if (numAlumnos>=50 && numAlumnos<=99){
            precioAlumno=70;
        }
        else if (numAlumnos>=30 && numAlumnos<=49){
            precioAlumno=95;
        }
        else{
            System.out.println("El precio del autobús es de 4000€");
        }
        System.out.println("El precio por alumno es de "+precioAlumno+" €");
        
    }
    
}
