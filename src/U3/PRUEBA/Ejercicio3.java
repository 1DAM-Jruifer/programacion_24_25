//Realiza un programa que muestre por pantalla un array bidimensional con tantas filas y columnas como indique el usuario.
// Deberá rellenarse la matriz con números aleatorios entre 14 y 78 (ambos incluidos).
//A continuación, el programa debe insertar en un array pares los números que se encuentran en la intersección de las
// filas pares con las columnas pares. Se hace lo mismo para el array impares con los
// números que se encuentran en la intersección de las filas impares con las columnas impares.
//Finalmente se debe mostrar la matriz de números, el array de números pares, el de números impares,
// y la suma, media y máximo y mínimo de cada uno de los arrays pares e impares.

package U3.PRUEBA;

import java.util.Scanner;

import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Introduce el número de filas de la matriz: ");
        int filas = scanner.nextInt();
        System.out.print("Introduce el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(65) + 14;
            }
        }

        int[] pares = new int[filas * columnas];
        int[] impares = new int[filas * columnas];
        int indexPares = 0, indexImpares = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                if (i % 2 == 0 && j % 2 == 0) {
                    pares[indexPares++] = matriz[i][j];
                }

                if (i % 2 != 0 && j % 2 != 0) {
                    impares[indexImpares++] = matriz[i][j];
                }
            }
        }

        pares = ajustarTamañoArray(pares, indexPares);
        impares = ajustarTamañoArray(impares, indexImpares);

        System.out.println("Matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Array de números en intersección de filas y columnas pares:");
        mostrarArray(pares);

        System.out.println("Array de números en intersección de filas y columnas impares:");
        mostrarArray(impares);

        System.out.println("Estadísticas para el array de pares:");
        mostrarEstadisticas(pares);

        System.out.println("Estadísticas para el array de impares:");
        mostrarEstadisticas(impares);
    }

    public static int[] ajustarTamañoArray(int[] array, int tamaño) {
        int[] resultado = new int[tamaño];
        System.arraycopy(array, 0, resultado, 0, tamaño);
        return resultado;
    }

    public static void mostrarArray(int[] array) {
        if (array.length == 0) {
            System.out.println("No hay elementos en el array.");
        } else {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void mostrarEstadisticas(int[] array) {
        if (array.length == 0) {
            System.out.println("No hay elementos en el array para calcular estadísticas.");
        } else {
            int suma = 0;
            int max = array[0];
            int min = array[0];
            for (int num : array) {
                suma += num;
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
            double media = (double) suma / array.length;
            System.out.println("Suma: " + suma);
            System.out.println("Media: " + media);
            System.out.println("Máximo: " + max);
            System.out.println("Mínimo: " + min);
        }
    }
}
