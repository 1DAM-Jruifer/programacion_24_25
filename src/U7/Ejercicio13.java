//Actividad 13: Implementar una función a la que se le pasen dos listas ordenadas y nos devuelva una
// única lista, fusión de las dos anteriores. Desarrollar el algoritmo de forma no destructiva, es decir,
// que las listas utilizadas como parámetros de entrada se mantengan intactas.

package U7;

import java.util.*;

public class Ejercicio13 {

    public static void main(String[] args) {

        List<Integer> lista1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> lista2 = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> listaFusionada = fusionarListas(lista1, lista2);

        System.out.println("Lista fusionada: " + listaFusionada);
    }

    public static List<Integer> fusionarListas(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> resultado = new ArrayList<>();
        int i = 0, j = 0;

        while (i < lista1.size() && j < lista2.size()) {
            if (lista1.get(i) <= lista2.get(j)) {
                resultado.add(lista1.get(i));
                i++;
            } else {
                resultado.add(lista2.get(j));
                j++;
            }
        }

        while (i < lista1.size()) {
            resultado.add(lista1.get(i));
            i++;
        }

        while (j < lista2.size()) {
            resultado.add(lista2.get(j));
            j++;
        }

        return resultado;
    }
}
