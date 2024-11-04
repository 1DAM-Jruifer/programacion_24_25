//Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son negativos.

package U1.Tarea8b;
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0, negativos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero >= 0) {
                positivos++;
            } else {
                negativos++;
            }
        }

        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);


    }
}