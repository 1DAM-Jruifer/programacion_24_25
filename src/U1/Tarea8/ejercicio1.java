//Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es positivo, y su cuadrado. El proceso terminará cuando el número introducido por teclado sea 0.

package U1.Tarea8;
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número (0 para terminar): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0) {
                    System.out.println("El número es par.");
                } else {
                    System.out.println("El número es impar.");
                }

                if (numero > 0) {
                    System.out.println("El número es positivo.");
                } else {
                    System.out.println("El número es negativo.");
                }

                System.out.println("El cuadrado del número es: " + (numero * numero));
            }
        } while (numero != 0);

        System.out.println("Programa terminado.");
    }

}
