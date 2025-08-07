package dia6;

import java.util.ArrayList;

public class Dia_6 {
    public static void main(String[] args) {
        Animal perro1 = new Perro("Laser",2);
        Animal gato1 = new Gato("Elvira",4);
        Animal mascota = new Animal("Troy", 2);
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(perro1);
        animales.add(gato1);
        animales.add(mascota);

        presentarAnimales(animales);

    }

    private static void presentarAnimales(ArrayList<Animal> animales) {
        for (Animal animal : animales) {
            animal.mostrarDatos();
            animal.hacerSonido();
        }
    }
}
