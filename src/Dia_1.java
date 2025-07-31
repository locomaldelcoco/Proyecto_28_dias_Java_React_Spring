import java.util.Scanner;

public class Dia_1 {
    public static void main(String[] args) {
        System.out.println("¿Que operación deseas realizar?" + "\n" +
                "1 - Calcular aréa de un triangulo" + "\n" +
                "2 - Calcular aréa de un rectángulo");
        Scanner entrada = new Scanner(System.in);
        int opcion = entrada.nextInt();

        if (opcion == 1){
            System.out.print("Ingrese la base del triángulo: ");
            double base = entrada.nextDouble();
            System.out.print("Ingrese la altura del triángulo: ");
            double altura = entrada.nextDouble();

            double area = (base * altura) / 2;
            System.out.println("El área del triángulo es: " + area);

        } else if (opcion == 2) {
            System.out.print("Ingrese la base del rectángulo: ");
            double base = entrada.nextDouble();
            System.out.print("Ingrese la altura del rectángulo: ");
            double altura = entrada.nextDouble();

            double area = base * altura;
            System.out.println("El área del rectángulo es: " + area);
        } else {
            System.out.println("Opción invalida - proceso finalizado");
        }
    }
}
