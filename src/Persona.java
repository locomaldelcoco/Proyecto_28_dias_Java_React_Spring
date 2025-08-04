import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    private int dni;

    Persona(String nombre, int edad, int dni){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public void mostrarInformacion(){
        System.out.printf("---------------------\nNombre: %s\nEdad: %d\nDni: %d\n---------------------%n",this.nombre,this.edad,this.dni);
    }

    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
