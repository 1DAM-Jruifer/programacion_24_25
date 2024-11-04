//Pedir un número y calcular su factorial.

package U1.Tarea8;
import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        long factorial = 1;
        for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);


    }

}
