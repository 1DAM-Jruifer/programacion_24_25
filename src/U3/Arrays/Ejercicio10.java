//Escribir la función rellenaPares() a la que se le pasa como parámetro una tabla unidimensional que
// debe rellenar de la siguiente forma: se leerá por teclado una serie de números, guardando en la tabla los pares hasta
// que esté llena, e ignorando los impares. La función tiene que devolver la cantidad de impares desechados.

package U3.Arrays;
import java.util.Scanner;
public class Ejercicio10 {
    public static int rellenaPares(int[] tabla) {
        Scanner scanner = new Scanner(System.in);
        int imparesDesechados = 0;
        int index = 0;

        while (index < tabla.length) {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                tabla[index] = numero;
                index++;
            } else {

                imparesDesechados++;
            }
        }

        return imparesDesechados;
    }

    public static void main(String[] args) {

        int[] tabla = new int[10];

        int impares = rellenaPares(tabla);

        System.out.println("Contenido de la tabla con los números pares:");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i] + " ");
        }

        System.out.println("\nCantidad de impares desechados: " + impares);
    }
}
