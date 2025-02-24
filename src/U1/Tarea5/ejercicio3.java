// Crea un programa que diga si el número introducido por el usuario es impar o no lo es.

package U1.Tarea5;
import java.util.Scanner;
public class ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        if (esImpar(numero)) {
            System.out.println("El número es impar.");
        } else {
            System.out.println("El número no es impar.");
        }

        scanner.close();
    }

    public static boolean esImpar(int numero) {
        return numero % 2 != 0;
    }
}
