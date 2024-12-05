//Escribe un programa que pida 8 palabras y las almacene en un array.
// A continuación, las palabras correspondientes a colores se deben almacenar al comienzo y las que no son colores a continuación.
// Puedes utilizar tantos arrays auxiliares como quieras. Los colores que conoce el programa deben estar en otro array
// y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro, blanco y morado.

package U3.Arrays2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};

        String[] palabrasColores = new String[8];
        String[] palabrasNoColores = new String[8];
        int colorIndex = 0;
        int noColorIndex = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce 8 palabras:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            String palabra = scanner.nextLine().toLowerCase();
            boolean esColor = false;

            for (String color : colores) {
                if (palabra.equals(color)) {
                    esColor = true;
                    break;
                }
            }

            if (esColor) {
                palabrasColores[colorIndex++] = palabra;
            } else {
                palabrasNoColores[noColorIndex++] = palabra;
            }
        }

        System.out.println("\nPalabras organizadas:");
        System.out.print("Colores: ");
        for (int i = 0; i < colorIndex; i++) {
            System.out.print(palabrasColores[i] + " ");
        }
        System.out.println();

        System.out.print("No colores: ");
        for (int i = 0; i < noColorIndex; i++) {
            System.out.print(palabrasNoColores[i] + " ");
        }
    }
}
