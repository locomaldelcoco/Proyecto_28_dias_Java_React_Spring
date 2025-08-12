package dia7;

public class Pajaro implements Volador{
    private String nombre;
    private String tipo;

    public Pajaro(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public void volar() {
        System.out.println("Nado como un pájaro");
    }

    public void mostrarDatos () {
        System.out.printf("%s: %s\nTipo: %s",getClass().getSimpleName(),this.nombre,this.tipo);
    }
}
