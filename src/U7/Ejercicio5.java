//Actividad 5: Crear una colección de 20 números enteros aleatorios distintos menores que 100,
// guardarlos por orden decreciente a medida que se vayan generando, y mostrar la colección por pantalla.

package U7;
import java.util.*;
public class Ejercicio5 {

    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>(Collections.reverseOrder());
        Random rand = new Random();

        while (numeros.size() < 20) {
            int num = rand.nextInt(100);
            numeros.add(num);
        }

        System.out.println("Números generados en orden decreciente:");
        System.out.println(numeros);
    }
}
