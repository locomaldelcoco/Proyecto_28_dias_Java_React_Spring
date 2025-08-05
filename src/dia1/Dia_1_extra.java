package dia1;
import java.util.Scanner;

public class Dia_1_extra {
    public static void main(String[] args){
        /*
        🎯 Objetivo:
        Crear un programa que permita calcular el área de 3 figuras diferentes: triángulo, rectángulo y círculo.
        El usuario elige qué operación quiere hacer desde un menú, y luego se le piden los datos correspondientes.
        */
        System.out.println(
                "--------¿Qué área deseas calcular?--------" + "\n" + "1 - Triángulo" + "\n" + "2 - Rectángulo" + "\n" + "3 - Círculo"
        );
        Scanner entrada = new Scanner(System.in);
        int usuario = entrada.nextInt();


        if (usuario == 1){ // Triángulo: base y altura → área = (base × altura) / 2
            double base,altura;
            System.out.println("Ingresa la base: ");
            base = entrada.nextDouble();
            System.out.println("Ingresa la altura: ");
            altura = entrada.nextDouble();
            System.out.println("El área del Triángulo es: " + (base * altura) / 2);
        } else if (usuario == 2) { // Rectángulo: base y altura → área = base × altura
            double base,altura;
            System.out.println("Ingresa la base: ");
            base = entrada.nextDouble();
            System.out.println("Ingresa la altura: ");
            altura = entrada.nextDouble();
            System.out.println("El área del Triángulo es: " + (base * altura) );
        } else if (usuario == 3) { // Círculo: radio → área = π × radio² (usá Math.PI y Math.pow)
            double radio;
            System.out.println("Ingresa el radio: ");
            radio = entrada.nextDouble();
            System.out.println("El área del Círculo es: " +  (Math.PI * Math.pow(radio,2)) );
        }else {
            System.out.println("Opción incorrecta. Cerrando programa.");
        }
    }
}
