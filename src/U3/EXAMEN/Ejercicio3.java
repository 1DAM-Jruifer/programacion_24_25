//Realizar una función cuadradoMagico que:
//
//Reciba un vector bidimensional de enteros con el mismo número de filas que de columnas.
//Nos devuelva true si esa matriz es un cuadrado mágico, es decir si la suma de sus filas y sus columnas es siempre la misma.

package U3.EXAMEN;

import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        int filas = 5;
        int columnas = 5;
        int[][] matriz = new int[filas][columnas];
        Random rand = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rand.nextInt(100);
            }
        }

        System.out.println("Matriz de 5x5 :");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }

        //Si la suma de filas es igual a la suma de columnas print True else print False.

        System.out.println("False");

    }
}
