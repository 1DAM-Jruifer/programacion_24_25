package U1.Examen;
import java.util.Scanner;
public class Examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la altura del arbol (mayor o igual a 4): ");
        int altura = scanner.nextInt();
        if (altura % 2 == 0 || altura < 3) {
            System.out.println("Error: la altura debe ser mayor o igual a 4");
        } else {

            for (int i = 0; i < altura; i++) {
            }

            for (int i = 1; i <= altura; i++) {
                for (int j = 0; j < altura - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (2 * i - 1); j++) {
                    System.out.print("^");
                }
                System.out.println();
            }

            for (int i = 1; i <= altura; i++) {
                for (int j = 0; j < altura - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j == 0; j--) {
                    System.out.print("Y");
                }
                System.out.println();
            }
        }
    }
}