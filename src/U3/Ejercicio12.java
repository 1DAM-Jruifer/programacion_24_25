package U3;
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero para calcular su factorial:");

        int num = teclado.nextInt();

        if (num < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {

            long result = factorial(num);

            System.out.println("El factorial de " + num + " es: " + result);

        }
    }
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}