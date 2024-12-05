//Actividad 2: Diseñar una  función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.

package U3;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        pedirnum();
    }

    public static void pedirnum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el primer número: ");
        int num1 = scanner.nextInt();

        System.out.println("Dime el segundo numero:");
        int num2 = scanner.nextInt();

        for (int i = num1+1; i <num2 ; i++) {
            System.out.println(i);

        }
    }
}
