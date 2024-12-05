package U3.Arrays;

import java.util.Random;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Introduce el número de dígitos de la clave secreta: ");
        int n = scanner.nextInt();

        int[] claveSecreta = new int[n];
        for (int i = 0; i < n; i++) {
            claveSecreta[i] = random.nextInt(5) + 1;
        }

        System.out.println("Tienes que adivinar la combinación secreta de " + n + " dígitos.");

        int intentos = 0;
        boolean adivinado = false;


        while (!adivinado) {
            intentos++;
            System.out.println("\nIntento " + intentos + ": Introduce tu combinación de prueba.");

            int[] combinacionPrueba = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Introduce el dígito " + (i + 1) + ": ");
                combinacionPrueba[i] = scanner.nextInt();
            }


            adivinado = true;
            for (int i = 0; i < n; i++) {
                if (combinacionPrueba[i] < claveSecreta[i]) {
                    System.out.println("El dígito " + (i + 1) + " es menor que el de la clave secreta.");
                    adivinado = false;
                } else if (combinacionPrueba[i] > claveSecreta[i]) {
                    System.out.println("El dígito " + (i + 1) + " es mayor que el de la clave secreta.");
                    adivinado = false;
                } else {
                    System.out.println("El dígito " + (i + 1) + " es igual al de la clave secreta.");
                }
            }

            if (adivinado) {
                System.out.println("\n¡Felicidades! Has adivinado la combinación secreta en " + intentos + " intentos.");
            }
        }
    }
}