//Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas relleno con números aleatorios
//entre 200 y 300. A continuación, el programa debe mostrar los números de la diagonal que va desde las esquinas
//superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo y la media de los números que hay en esa diagonal.

package U3.Arrays2;

import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        int filas = 10;
        int columnas = 10;
        int[][] matriz = new int[filas][columnas];
        Random rand = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rand.nextInt(101) + 200;
            }
        }

        System.out.println("Matriz de 10x10 generada:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Elementos de la diagonal principal:");
        int[] diagonal = new int[filas];
        for (int i = 0; i < filas; i++) {
            diagonal[i] = matriz[i][i];
            System.out.print(diagonal[i] + " ");
        }

        int max = diagonal[0];
        int min = diagonal[0];
        int suma = 0;

        for (int i = 0; i < diagonal.length; i++) {
            if (diagonal[i] > max) {
                max = diagonal[i];
            }
            if (diagonal[i] < min) {
                min = diagonal[i];
            }
            suma += diagonal[i];
        }

        double media = (double) suma / diagonal.length;

        System.out.println("Máximo de la diagonal: " + max);
        System.out.println("Mínimo de la diagonal: " + min);
        System.out.println("Media de la diagonal: " + media);
    }
}
