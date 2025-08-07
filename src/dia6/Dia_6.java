package dia6;

public class Dia_6 {
    public static void main(String[] args) {
        Animal perro1 = new Perro("Laser",2);
        Animal gato1 = new Gato("Elvira",4);
        Animal mascota = new Animal("Troy", 2);

        perro1.mostrarDatos();
        perro1.hacerSonido();

        gato1.mostrarDatos();
        gato1.hacerSonido();

        mascota.mostrarDatos();
        mascota.hacerSonido();
    }
}
