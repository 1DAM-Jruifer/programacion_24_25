// Implementar una aplicación que pida un número al usuario entre el 1 y el 10, y calcule su tabla de multiplicar.
// El código debe asegurarse de que el número introducido está entre 1 y 10, y si no es así, volver a pedirlo hasta que lo cumpla.

package U1.Tarea8;
import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número entre 1 y 10: ");
            numero = scanner.nextInt();
        } while (numero < 1 || numero > 10);

        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

    }

}
