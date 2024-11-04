//Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que sean primos.
// Un número primo es aquel que sólo es divisible por 1 y por él mismo. Ejemplo: Para n=8:

package Tarea8;
import java.util.Scanner;
public class ejercicio15 {
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número n: ");
        int n = scanner.nextInt();

        int contadorPrimos = 0;


        for (int i = 1; i <= n; i++) {
            if (esPrimo(i)) {
                contadorPrimos++;
            }
        }

        System.out.println("Entre 1 y " + n + " hay " + contadorPrimos + " números primos.");


    }

}
