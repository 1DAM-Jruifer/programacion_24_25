//Actividad 1: Crear una colección de 20 números enteros aleatorios menores que 100, y
// guardarlos en el orden en que se vayan generando; mostrar por pantalla dicha lista
// una vez creada. Ordenarla en sentido creciente y volverla a mostrar por pantalla.

package U7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio1 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            numeros.add(rand.nextInt(100));
        }

        System.out.println("Lista original: " + numeros);

        Collections.sort(numeros);

        System.out.println("Lista ordenada: " + numeros);
    }
}
