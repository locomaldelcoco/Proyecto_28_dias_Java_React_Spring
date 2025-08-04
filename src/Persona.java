import java.util.Scanner;

public class Persona {
    String nombre;
    int edad;
    int dni;
    Scanner input = new Scanner(System.in);

    Persona(){
        System.out.println("Ingrese el nombre de la persona: ");this.nombre = input.next();
        System.out.println("Ingrese la edad de la persona: ");this.edad = input.nextInt();
        System.out.println("Ingrese el dni de la persona: ");this.dni = input.nextInt();
    }

    Persona(String nombre, int edad, int dni){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public void mostrarInformacion(){
        System.out.println(String.format("---------------------\nNombre: %s\nEdad: %d\nDni: %d\n---------------------",this.nombre,this.edad,this.dni));
    }

    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }
}
