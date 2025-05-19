//Actividad 10: Hacer lo mismo que en el ejercicio anterior con la intersección ,
// formada por los elementos comunes a los dos conjuntos. Su prototipo es:
//
//Set interseccion (Set conjunto1, Set conjunto2)

package U7;

import java.util.*;

public class Ejercicio10 {
    public static void main(String[] args) {

        Set<String> conjunto1 = new HashSet<>(Arrays.asList("Ana", "Luis", "Carlos"));
        Set<String> conjunto2 = new HashSet<>(Arrays.asList("Pedro", "Carlos", "María"));

        Set<String> resultado = interseccion(conjunto1, conjunto2);

        System.out.println("Intersección de los conjuntos: " + resultado);
    }

    public static Set<String> interseccion(Set<String> conjunto1, Set<String> conjunto2) {

        Set<String> resultado = new HashSet<>(conjunto1);

        resultado.retainAll(conjunto2);

        return resultado;
    }


}
