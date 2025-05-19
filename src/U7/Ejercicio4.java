//Actividad 4: Introducir por consola una frase que conste exclusivamente de palabras separadas por espacios.
// Almacenar en una lista las palabras de la frase, una en cada nodo y mostrar por pantalla
// las palabras que estén repetidas. A continuación, mostrar las que no lo estén.

package U7;

import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine().trim();

        List<String> palabras = Arrays.asList(frase.split("\\s+"));

        Map<String, Integer> frecuencia = new HashMap<>();

        for (String palabra : palabras) {
            frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
        }

        List<String> repetidas = new ArrayList<>();
        List<String> noRepetidas = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > 1) {
                repetidas.add(entry.getKey());
            } else {
                noRepetidas.add(entry.getKey());
            }
        }

        System.out.println("Palabras repetidas:");
        if (repetidas.isEmpty()) {
            System.out.println("Ninguna");
        } else {
            System.out.println(repetidas);
        }

        System.out.println("Palabras no repetidas:");
        if (noRepetidas.isEmpty()) {
            System.out.println("Ninguna");
        } else {
            System.out.println(noRepetidas);
        }

        scanner.close();
    }
}
