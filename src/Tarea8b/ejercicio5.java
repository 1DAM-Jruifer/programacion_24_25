//Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado.
// El carácter con el que se pinta la pirámide también se debe pedir por teclado.

package Tarea8b;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = scanner.nextInt();
        System.out.print("Introduce el carácter para pintar la pirámide: ");
        char caracter = scanner.next().charAt(0);

        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }

    }

}
