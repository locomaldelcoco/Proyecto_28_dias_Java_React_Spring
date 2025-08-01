public class Dia_3 {
    public static void main(String[] args) {

    }

    // Método para determinar si una persona es mayor de edad
    public static String verificarEdad(int edad) {
        if (edad >= 18) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    // Método que clasifica una nota de examen
    public static String clasificarNota(int nota) {
        if (nota >= 90) {
            return "Excelente";
        } else if (nota >= 75) {
            return "Bueno";
        } else if (nota >= 60) {
            return "Regular";
        } else {
            return "Reprobado";
        }
    }

    // Método que devuelve un mensaje basado en el día de la semana (switch)
    public static String mensajeDia(int dia) {
        switch (dia) {
            case 1: return "Lunes - Empezamos la semana 💪";
            case 2: return "Martes - Seguimos con energía 🔋";
            case 3: return "Miércoles - Mitad de semana 🐪";
            case 4: return "Jueves - Casi viernes 😎";
            case 5: return "Viernes - ¡Ya casi! 🎉";
            case 6: return "Sábado - Descanso merecido 😴";
            case 7: return "Domingo - Tiempo en familia 👨‍👩‍👧‍👦";
            default: return "Día inválido";
        }
    }
}
