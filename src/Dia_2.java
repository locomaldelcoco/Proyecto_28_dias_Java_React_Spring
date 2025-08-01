import java.util.Scanner;

public class Dia_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion_usuario = 0;
        while (opcion_usuario == 0){
            System.out.println("---ELIJA UNA OPERACIÓN PARA REALIZAR---\n" +
                    "\n" + "1: Círculo (usa radio)\n" +
                    "\n" + "2: Rectángulo (usa base y altura)\n" +
                    "\n" + "3: Triángulo (usa tres lados)");
            opcion_usuario = input.nextInt();
            double dato_usuario1,dato_usuario2,dato_usuario3;

            switch (opcion_usuario){
                case 1:
                    System.out.println("\nIngresa los datos:");
                    dato_usuario1 = input.nextDouble();
                    System.out.println(String.format("\nEl perimetro de un Círculo de %fcm es: %fcm",dato_usuario1,calcularPerimetroCirculo(dato_usuario1)));
                    break;
                case 2:
                    System.out.println("\nIngresa los datos:");
                    dato_usuario1 = input.nextDouble(); dato_usuario2 = input.nextDouble();
                    System.out.println(String.format("\nEl perimetro de un Rectángulo de %fcm - %fcm es: %fcm",dato_usuario1,dato_usuario2,calcularPerimetroRectangulo(dato_usuario1,dato_usuario2)));
                    break;
                case 3:
                    System.out.println("\nIngresa los datos:");
                    dato_usuario1 = input.nextDouble(); dato_usuario2 = input.nextDouble(); dato_usuario3 = input.nextDouble();
                    System.out.println(String.format("\nEl perimetro de un Triángulo de %fcm - %fcm - %fcm es: %fcm",dato_usuario1,dato_usuario2,dato_usuario3,calcularPerimetroTriangulo(dato_usuario1,dato_usuario2,dato_usuario3)));
                    break;
                default:
                    opcion_usuario = 0;
                    System.out.println("\nERROR: ****INGRESE UNA OPCIÓN VÁLIDA POR FAVOR****\n");
            }
        }
        System.out.println("\n---FINALIZANDO PROGRAMA---");
    }

    // método para calcularPerimetroCirculo:
    public static double calcularPerimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }
    // método para calcularPerimetroRectangulo:
    public static double calcularPerimetroRectangulo(double base, double altura) {
        return (base + altura) * 2;
    }
    // método para calcularPerimetroTriangulo:
    public static double calcularPerimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }
}

