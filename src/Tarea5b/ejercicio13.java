//Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5.

package Tarea5b;
import java.util.Scanner;
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        boolean esPar = (numero % 2 == 0);

        boolean esDivisiblePor5 = (numero % 5 == 0);

        if (esPar) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }


        if (esDivisiblePor5) {
            System.out.println("El número es divisible entre 5.");
        } else {
            System.out.println("El número no es divisible entre 5.");
        }
    }

}
