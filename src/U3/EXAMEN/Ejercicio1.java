//Escribir una programa que solicitando el tamaño al usuario nos cree un array o vector de dicho tamaño
// cuyo contenido serán números aleatorios en 18 y 65 (ambos inclusive).
//A continuación crear una función paresImpares que:
//Reciba dicho vector
//Devuelva un vector con los pares al principio y los impares posteriormente respetando el orden de aparición
// en cada subgrupo ( pares - impares)

package U3.EXAMEN;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int filas = 1;

        // Aquí podemos cambiar el tamaño:


        int columnas = 6;

        //-----------------------------------

        int[][] array = new int[filas][columnas];

        Random rand = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                array[i][j] = rand.nextInt(65);
            }
        }

        System.out.println("Vector generado:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
        int[] fila = new int[6];

        System.out.println("Contenido del vector con los números pares:");
        for (int i = 0; i < fila.length; i++) {
            System.out.print(fila[i] + ",  ");
        }
    }
}
