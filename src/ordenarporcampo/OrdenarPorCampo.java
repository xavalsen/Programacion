package ordenarporcampo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenarPorCampo {

    private static List<Persona> personas = new ArrayList<>();
    public static void main(String[] args) {
        var p1 = new Persona("Bob", 20);
        var p2 = new Persona("Ana", 40);
        var p3 = new Persona("David", 19);
        var p4 = new Persona("Betis", 10);
        
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        
        // lista inicial de personas
        System.out.println("Personas:");
        muestraPersonas();
        
        // ordena por nombre
        System.out.println("Personas ordenadas por nombre:");
        ordenarPor(Persona.Atributo.NOMBRE);
        muestraPersonas();
        
        // ordena por edad
        System.out.println("Personas ordenadas por edad:");
        ordenarPor(Persona.Atributo.EDAD);
        muestraPersonas();
    }
    static void muestraPersonas(){
        for (Persona persona : personas){
            System.out.println(persona);
        }
    }

    static void ordenarPor(Persona.Atributo artibuto){
        
        switch(artibuto){
            case NOMBRE:
                personas.sort(Comparator.comparing(Persona::getNombre).thenComparing(Persona::getEdad));
                break;
            case EDAD:
                personas.sort(Comparator.comparing(Persona::getEdad));
                break;
                
        }
        
    }
}
