//Actividad 12: Escribir elmét
// odo incluido(), que devuelve true si todos los elementos del primer conjunto pertenecen al segundo
// y false si hay algún elemento del primero que no pertenezca al segundo. Su prototipo es:
//
//boolean incluido(Set conjunto1, Set conjunto2)

package U7;

import java.util.*;

public class Ejercicio12 {

    public static void main(String[] args) {

        Set<String> conjunto1 = new HashSet<>(Arrays.asList("Ana", "Luis", "Carlos"));
        Set<String> conjunto2 = new HashSet<>(Arrays.asList("Carlos", "Luis", "Ana", "Pedro"));

        boolean resultado = incluido(conjunto1, conjunto2);

        System.out.println("¿El primer conjunto está incluido en el segundo? " + resultado);
    }

    public static boolean incluido(Set<String> conjunto1, Set<String> conjunto2) {

        return conjunto2.containsAll(conjunto1);
    }
}
