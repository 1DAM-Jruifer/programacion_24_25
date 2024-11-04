//Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El programa pedirá la altura.
// Fíjate que el programa inserta un espacio y pinta dos asteriscos menos en la base para simular la curvatura de las esquinas inferiores.

package U1.Tarea8b;
import java.util.Scanner;
public class ejercio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la altura de la U: ");
        int altura = scanner.nextInt();

        for (int i = 0; i < altura - 1; i++) {
            System.out.println("*   *");
        }
        System.out.println(" * * ");
    }

}
