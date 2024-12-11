//Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos comprendidos
// entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá dar la posición tanto del máximo como del mínimo.

package U3.Arrays2;

import java.util.Random;

public class Ejercicio6 {
    public static void main(String[] args) {

        int filas = 6;
        int columnas = 10;

        int[][] array = new int[filas][columnas];

        Random rand = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                array[i][j] = rand.nextInt(1001);
            }
        }

        System.out.println("Array generado:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int maximo = array[0][0];
        int minimo = array[0][0];
        int posMax = 0;
        int posMin = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (array[i][j] > maximo) {
                    maximo = array[i][j];
                    posMax = i * columnas + j;
                }
                if (array[i][j] < minimo) {
                    minimo = array[i][j];
                    posMin = i * columnas + j;
                }
            }
        }

        int filaMax = posMax / columnas;
        int colMax = posMax % columnas;
        int filaMin = posMin / columnas;
        int colMin = posMin % columnas;

        System.out.println("El valor máximo es: " + maximo + " en la posición (" + filaMax + ", " + colMax + ")");
        System.out.println("El valor mínimo es: " + minimo + " en la posición (" + filaMin + ", " + colMin + ")");
    }
}
