//Diseñar una función que reciba como parámetros dos números enteros y que devuelva el mayor de los dos.

package U3;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        averigua();
    }

    public static void averigua() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el primer número: ");
        int num1 = scanner.nextInt();

        System.out.println("Dime el segundo numero:");
        int num2 = scanner.nextInt();

        if (num1 <num2) {
            System.out.println(num2);
        } else {
            System.out.println(num1);

        }

    }
}
