package dia6;

public class Animal {
    //Variables de instancia
    private String nombre;
    private int edad;
    private final int EDAD_MINIMA = 1;
    private final int EDAD_MAXIMA = 30;

    //Constructor
    public Animal(String nombre, int edad){
        setNombre(nombre);
        setEdad(edad);
    }

    //Métodos
    public void hacerSonido(){
        System.out.println("¡Pffff!");
    }

    public void mostrarDatos(){
        System.out.println("====== INFORMACIÓN DEL ANIMAL ======");
        System.out.println("Nombre: " + this.nombre + "\nEdad: " + this.edad);
    }

    //Getters and setters
    public void setNombre(String nombre) {
        if (nombre!=null && !nombre.isEmpty()){
            this.nombre = nombre;
        }else {
            System.out.println("Colocar nuevamente un nombre válido");
        }
    }

    public void setEdad(int edad) {
        if (edad >= EDAD_MINIMA && edad <= EDAD_MAXIMA){
            this.edad = edad;
        }else {
            throw new IllegalArgumentException(String.format("La edad debe estar entre " +
                    "%d y %d años.\nValor ingresado: %d",EDAD_MINIMA,EDAD_MAXIMA,edad));
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
