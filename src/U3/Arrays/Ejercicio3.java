//Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números.
// Realizar la media de los números positivos, la media de los negativos, y contar el número de ceros introducidos.

package U3.Arrays;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero: ");

        int num1 = scanner.nextInt();

        int num[] = new int[num1];

        double suma = 0;

        for (int i = 1; i <= num1; i++) {
            System.out.print("Introduce el número " + i + ": ");
            double numero = scanner.nextDouble();
            suma += numero;
        }

        double media = suma / num1;

        System.out.println("La media de los números introducidos es: " + media);
    }
}
