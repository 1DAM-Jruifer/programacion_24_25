//Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado.

package U1.Tarea8b;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        System.out.println("Número | Cuadrado | Cubo");
        for (int i = numero; i < numero + 5; i++) {
            System.out.printf("%6d | %8d | %4d%n", i, i * i, i * i * i);
        }
    }

}
