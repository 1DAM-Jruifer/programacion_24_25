package U3.RECUPERACIÓN;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int filas = 1;

        int columnas = 10;

        int[][] array = new int[filas][columnas];

        Random rand = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                array[i][j] = rand.nextInt(99);
            }
        }

        System.out.println("Vector Inicial:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
        int[] fila = new int[9];

        System.out.println("Contenido del vector con los números primos en primeras posiciones:");
        for (int i = 0; i < fila.length; i++) {
            System.out.print(fila[i] + ",  ");
        }
    }

}
