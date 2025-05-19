//Actividad 3: Crear una colección de 20 números enteros aleatorios menores que 10,
// guardarlos por orden decreciente a medida que se vayan generando y mostrar la colección por pantalla.

package U7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio3 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            int num = rand.nextInt(10);
            numeros.add(num);
            Collections.sort(numeros, Collections.reverseOrder());
        }

        System.out.println("Números generados en orden decreciente:");
        System.out.println(numeros);
    }
}
