package dia7;

public class Avion implements Volador{
    private String nombre;
    private String tipo;

    public Avion (String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public void volar () {
        System.out.println("Vuelo como un avion");
    }

    public void mostrarDatos () {
        System.out.println();
    }
}
