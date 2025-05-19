//Actividad 8: Implementar una función a la que se le pase una lista de nombres y devuelva
// una copia sin elementos repetidos (sin modificar la original), con el prototipo:
//
//List eliminaRepetidos (List c)

package U7;

import java.util.*;

public class Ejercicio8 {

    public static void main(String[] args) {

        List<String> nombres = Arrays.asList("Ana", "Luis", "Carlos", "Ana", "Pedro", "Luis", "María", "Carlos");

        List<String> listaSinRepetidos = eliminaRepetidos(nombres);

        System.out.println("Lista original: " + nombres);
        System.out.println("Lista sin repetidos: " + listaSinRepetidos);
    }

    public static List<String> eliminaRepetidos(List<String> c) {

        return new ArrayList<>(new LinkedHashSet<>(c));
    }
}
