package dia3;
import java.util.Scanner;

public class Dia_3_extra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nPor favor ingrese su edad: ");
        int usuario_edad = input.nextInt();

        String edad_verificada = Dia_3.verificarEdad(usuario_edad);
        if( edad_verificada.equalsIgnoreCase("Mayor de edad")){
            System.out.println("\nUsted tiene "+ usuario_edad + " años. Por lo tanto es " + edad_verificada + " y puede votar.");
        }else {
            System.out.println("\nUsted tiene "+ usuario_edad + " años. Por lo tanto es " + edad_verificada + " y no puede votar.");
        }
        System.out.println("\nElija una opción:\n" + "1: Sumar dos números\n" + "2: Restar\n" + "3: Multiplicar\n" + "4: Dividir");

        int operacion_elegida = input.nextInt();
        switch (operacion_elegida){
            case 1: sumar(pedirDatos(input),pedirDatos(input));
                break;
            case 2: restar(pedirDatos(input), pedirDatos(input));
                break;
            case 3: multiplicar(pedirDatos(input), pedirDatos(input));
                break;
            case 4: dividir(pedirDatos(input), pedirDatos(input));
                break;
            default:
                System.out.println("Por favor ingresar una opción valida");
        }
    }
    private static int pedirDatos(Scanner input) {
        System.out.println("Ingrese el dato de la operación:");
        return input.nextInt();
    }

    private static void dividir(int num1, int num2) {
        System.out.println("El resultado es: " + (num1 / num2));
    }
    private static void multiplicar(int num1, int num2) {
        System.out.println("El resultado es: " + (num1 * num2));
    }
    private static void restar(int num1, int num2) {
        System.out.println("El resultado es: " + (num1 - num2));
    }
    private static void sumar(int num1, int num2) {
        System.out.println("El resultado es: " + (num1 + num2));
    }
}
