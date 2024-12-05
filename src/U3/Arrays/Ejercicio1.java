// Diseñar un programa que solicite al usuario 5 números decimales. A continuación, debe mostrar los números en el mismo orden en que se han introducido.

package U3.Arrays;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num[] = new double[5];

        System.out.println("Introduce los 5 numeros: ");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            num[i] = scanner.nextDouble();
        }
        System.out.println("Los números ingresados son:");
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }
    }
}
