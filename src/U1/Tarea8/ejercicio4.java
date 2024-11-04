//Escribir una aplicación que pida un número n, y escriba los números desde 1 hasta n.

package U1.Tarea8;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }


    }

}
