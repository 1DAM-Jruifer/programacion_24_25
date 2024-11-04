package U1.Tarea1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la altura de la pirámide: ");
        int altura = teclado.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < altura - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print(" ");
            }
            System.out.println();

        }

        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}