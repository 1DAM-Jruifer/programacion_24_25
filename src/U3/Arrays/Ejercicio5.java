//Leer una serie de 6 enteros que se almacenarán en una tabla que hay que ordenar y mostrar. Hacer lo mismo con otra serie de 6 enteros.
// A continuación, fusionar las dos tablas en una tercera, de forma que los 12 números sigan ordenados.
// Fusionar significa copiar en el orden correcto para que los datos resultantes continúen ordenados sin necesidad de volver a realizar una ordenación.

package U3.Arrays;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tabla1 = new int[6];
        int[] tabla2 = new int[6];

        System.out.println("Ingrese 6 números enteros para la primera tabla:");
        for (int i = 0; i < 6; i++) {
            tabla1[i] = scanner.nextInt();
        }

        System.out.println("Ingrese 6 números enteros para la segunda tabla:");
        for (int i = 0; i < 6; i++) {
            tabla2[i] = scanner.nextInt();
        }

        java.util.Arrays.sort(tabla1);
        java.util.Arrays.sort(tabla2);

        System.out.println("Primera tabla ordenada:");
        for (int num : tabla1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Segunda tabla ordenada:");
        for (int num : tabla2) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] tablaFusionada = new int[12];

        int i = 0, j = 0, k = 0;

        while (i < tabla1.length && j < tabla2.length) {
            if (tabla1[i] < tabla2[j]) {
                tablaFusionada[k++] = tabla1[i++];
            } else {
                tablaFusionada[k++] = tabla2[j++];
            }
        }

        while (i < tabla1.length) {
            tablaFusionada[k++] = tabla1[i++];
        }

        while (j < tabla2.length) {
            tablaFusionada[k++] = tabla2[j++];
        }

        System.out.println("Tabla fusionada ordenada:");
        for (int num : tablaFusionada) {
            System.out.print(num + " ");
        }
    }
}