// Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.

package U1.Tarea8b;
import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        int invertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }

        System.out.println("El número al revés es: " + invertido);
    }

}
