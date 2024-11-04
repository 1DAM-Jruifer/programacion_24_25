//Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir la altura.
// Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.

package U1.Tarea8b;
import java.util.Scanner;
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la altura de la X (impar y mayor o igual a 3): ");
        int altura = scanner.nextInt();

        if (altura % 2 == 0 || altura < 3) {
            System.out.println("Error: la altura debe ser impar y mayor o igual a 3.");
        } else {
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < altura; j++) {
                    if (i == j || i + j == altura - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

    }

}
