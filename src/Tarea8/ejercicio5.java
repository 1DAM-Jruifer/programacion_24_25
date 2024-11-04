//Desarrollar un programa que solicite los valores mínimo y máximo de un rango.
// A continuación, solicitará por teclado un valor que debe estar dentro del rango.
// Si no es asi, volverá a solicitar un número, y así repetidas veces hasta que el valor esté dentro del rango.

package Tarea8;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor mínimo del rango: ");
        int min = scanner.nextInt();

        System.out.print("Introduce el valor máximo del rango: ");
        int max = scanner.nextInt();

        int valor;
        do {
            System.out.print("Introduce un valor dentro del rango (" + min + "-" + max + "): ");
            valor = scanner.nextInt();
        } while (valor < min || valor > max);

        System.out.println("El valor introducido está dentro del rango.");


    }

}
