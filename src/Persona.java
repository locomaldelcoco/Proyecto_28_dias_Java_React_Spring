import java.util.Scanner;

public class Persona {
    String nombre;
    int edad;
    int dni;
    Scanner input = new Scanner(System.in);



    Persona(String nombre, int edad, int dni){
        this.nombre = input.next();
        this.edad = input.nextInt();
        this.dni = input.nextInt();
    }

    public void mostrarInformacion(){
        System.out.println(String.format("Nombre: %s\nEdad: %d\nDni: %d",this.nombre,this.edad,this.dni));
    }

    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }
}
