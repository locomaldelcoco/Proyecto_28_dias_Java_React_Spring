package dia7;

public class Submarino implements Nadador{
    private String nombre;
    private String tipo;

    public Submarino (String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public void nadar () {
        System.out.println("Nado pero como un submarino");
    }

    public void mostrarDatos (){
        System.out.printf("%s: %s\nTipo: %s\n",getClass().getSimpleName(),this.nombre,this.tipo);
    }
}
