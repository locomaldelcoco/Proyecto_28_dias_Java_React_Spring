package dia7;

public class Pez implements Nadador{
    private String nombre;
    private String tipo;

    public Pez (String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public void nadar () {
        System.out.println("Nado como un pez");
    }

    public void mostrarDatos(){
        System.out.println();
    }
}
