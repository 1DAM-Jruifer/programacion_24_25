//Actividad 11: Diseñar unmétdo
// que devuelva la diferencia de dos conjuntos (elementos que pertenecen al primero, pero no al segundo). Con el prototipo:
//
//Set diferencia (Set conjunto1, Set conjunto2)

package U7;

import java.util.*;

public class Ejercicio11 {

    public static void main(String[] args) {

        Set<String> conjunto1 = new HashSet<>(Arrays.asList("Ana", "Luis", "Carlos"));
        Set<String> conjunto2 = new HashSet<>(Arrays.asList("Pedro", "Carlos", "María"));

        Set<String> resultado = diferencia(conjunto1, conjunto2);

        System.out.println("Diferencia de los conjuntos: " + resultado);
    }

    public static Set<String> diferencia(Set<String> conjunto1, Set<String> conjunto2) {

        Set<String> resultado = new HashSet<>(conjunto1);

        resultado.removeAll(conjunto2);

        return resultado;
    }
}
