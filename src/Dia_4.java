public class Dia_4 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Santiago",25,42545214);
        Persona persona2 = new Persona();

        persona1.mostrarInformacion();
        System.out.println(persona1.esMayorDeEdad());
    }
}
