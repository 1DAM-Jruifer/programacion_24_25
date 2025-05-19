//Actividad 9: Implementar el méodo unión de dos conjuntos, que devuelva un nuevo conjunto con todos los elementos que
// pertenezcan, al menos, a uno de los dos conjuntos. Su prototipo es:
//
//Set union (Set conjunto1, Set conjunto2)

package U7;

import java.util.*;

public class Ejercicio9 {

    public static void main(String[] args) {

        Set<String> conjunto1 = new HashSet<>(Arrays.asList("Ana", "Luis", "Carlos"));
        Set<String> conjunto2 = new HashSet<>(Arrays.asList("Pedro", "Carlos", "María"));

        Set<String> resultado = union(conjunto1, conjunto2);

        System.out.println("Unión de los conjuntos: " + resultado);
    }

    public static Set<String> union(Set<String> conjunto1, Set<String> conjunto2) {

        Set<String> resultado = new HashSet<>(conjunto1);

        resultado.addAll(conjunto2);

        return resultado;
    }
}
