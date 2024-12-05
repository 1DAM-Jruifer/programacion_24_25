//Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos).
// A continuación el programa mostrará el array y preguntará si el usuario quiere destacar el máximo o el mínimo. Seguidamente,
// se volverá a mostrar el array escribiendo el número destacado entre dobles asteriscos.

package U3.Arrays2;

import java.util.Random;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(501);
        }

        System.out.println("Array original:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Quieres destacar el maximo o el minimo? (Escribe 'maximo' o 'minimo')");
        String opcion = scanner.nextLine();

        int indiceDestacado = -1;
        if (opcion.equalsIgnoreCase("maximo")) {
            int maximo = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > maximo) {
                    maximo = array[i];
                    indiceDestacado = i;
                }
            }
            System.out.println("El maximo es: " + array[indiceDestacado]);
        } else if (opcion.equalsIgnoreCase("minimo")) {
            int minimo = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < minimo) {
                    minimo = array[i];
                    indiceDestacado = i;
                }
            }
            System.out.println("El minimo es: " + array[indiceDestacado]);
        } else {
            System.out.println("Opcion no valida.");
            return;
        }

        System.out.println("Array con el número destacado:");
        for (int i = 0; i < array.length; i++) {
            if (i == indiceDestacado) {
                System.out.print("**" + array[i] + "** ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
}
