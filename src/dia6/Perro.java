package dia6;

public class Perro extends Animal {

    public Perro (String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getClass().getSimpleName() + ": " + "Guau");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }

}
