package dia4_5;

public class Persona {
    private String nombre;
    private int edad;
    private int dni;

    Persona(String nombre, int edad, int dni){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public void mostrarInformacion(){
        System.out.println(toString());
    }

    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        if (dni > 0 && dni < 99999999){
            this.dni = dni;
        }else {
            System.out.println("Favor de ingresar un DNI correcto");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 1 && edad <= 115){
            this.edad = edad;
        }else {
            System.out.println("Favor de ingresar edad correcta");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!nombre.trim().isEmpty() && nombre.length() <= 15) {
            this.nombre = nombre;
        }else {
            System.out.println("Favor de ingresar nombre correcto");
        }
    }

    @Override
    public String toString() {
        return "Persona{ " +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                '}';
    }
}
