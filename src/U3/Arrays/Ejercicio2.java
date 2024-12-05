//Escribir una aplicación que solicite al usuario cuántos números desea introducir.
// A continuación, se introducirá por teclado esa cantidad de números enteros, y por último
// los mostrará en el orden inverso al introducido.

package U3.Arrays;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos numeros quieres introducir: ");

        int num1 = scanner.nextInt();

        double num[] = new double[num1];

        System.out.println("Introduce los numeros: ");

        for (int i = 0; num1>i; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            num[i] = scanner.nextDouble();
        }
        System.out.println("Los números ingresados son:");
        for (int i = num1 - 1; i>=0; i--) {
            System.out.println(num[i]);
        }
    }
}