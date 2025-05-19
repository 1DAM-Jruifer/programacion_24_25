//Actividad 2: Repetir el ejercicio anterior, pero ordenar la lista en sentido decreciente.

package U7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio2 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            numeros.add(rand.nextInt(100));
        }

        System.out.println("Lista original: " + numeros);

        numeros.sort(Collections.reverseOrder());

        System.out.println("Lista ordenada en orden decreciente: " + numeros);
    }
}
