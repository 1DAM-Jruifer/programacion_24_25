//Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando
// los dos anteriores,por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe introducir por teclado.

package Tarea8b;
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de términos de la serie de Fibonacci: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;

        System.out.print("Serie de Fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }

}
