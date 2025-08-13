package dia7;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Nadador> nadadores = new ArrayList<Nadador>();
        List<Volador> voladores = new ArrayList<Volador>();

        nadadores.add(new Pez("Carlos","Espada"));
        nadadores.add(new Submarino("Ara San Juan","Militar"));
        voladores.add(new Avion("Cami Mayan","Militar"));
        voladores.add(new Pajaro("Cannigia","Águila"));

       mostrarNadadores(nadadores);
       mostrarVoladores(voladores);
    }

    public static void mostrarVoladores(List<Volador> lista){
        for (Volador v : lista){v.mostrarDatos();v.volar();}
    }
    public static void mostrarNadadores(List<Nadador> lista){
        for (Nadador n: lista){n.mostrarDatos();n.nadar();}
    }
}