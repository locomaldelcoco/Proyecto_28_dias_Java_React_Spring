package dia4_5;

import java.util.Scanner;

public class Dia_4 {
    public static void main(String[] args) {
        String nombre; int edad, dni;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona: ");nombre = input.next();
        System.out.println("Ingrese la edad de la persona: ");edad = input.nextInt();
        System.out.println("Ingrese el dni de la persona: ");dni = input.nextInt();

        Persona persona1 = new Persona("Santiago",25,42545214);
        Persona persona2 = new Persona(nombre,edad,dni);
        Persona persona3 = new Persona("",10,23123993);
        Persona persona4 = new Persona("pepe", 99, 1329120300);

        persona1.mostrarInformacion();
        System.out.println("Es mayor de edad: " + persona1.esMayorDeEdad());
        persona2.mostrarInformacion();
        System.out.println("Es mayor de edad: " + persona2.esMayorDeEdad());
        persona3.mostrarInformacion();
        System.out.println("Es mayor de edad: " + persona3.esMayorDeEdad());
        persona4.mostrarInformacion();
        System.out.println("Es mayor de edad: " + persona4.esMayorDeEdad());
    }
}
