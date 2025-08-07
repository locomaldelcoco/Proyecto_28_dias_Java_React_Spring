package dia6;

public class Gato extends Animal {

    public Gato (String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getClass().getSimpleName() + ": "+ "Miaau");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }
}
