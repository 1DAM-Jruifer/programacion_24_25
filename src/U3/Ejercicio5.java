//Repetir el ejercicio anterior con una versión que calcule el máximo de 3 números.
// Piensa un poco, no hagas el algoritmo de comparación de los 3 números desde cero.

package U3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        averigua();
    }

    public static void averigua() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el primer número: ");
        int num1 = scanner.nextInt();

        System.out.println("Dime el segundo numero:");
        int num2 = scanner.nextInt();

        System.out.println("Dime el tercer numero:");
        int num3 = scanner.nextInt();

        if (num1 < num2) {
            if (num2 < num3) ;
            System.out.println(num3);
        } else if (num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num1);
        }
    }
}
