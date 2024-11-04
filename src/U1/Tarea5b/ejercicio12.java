//Escribe un programa que ordene tres números enteros introducidos por teclado.

package U1.Tarea5b;
import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.print("Introduce el primer número: ");
        int num1 = teclado.nextInt();


        System.out.print("Introduce el segundo número: ");
        int num2 = teclado.nextInt();


        System.out.print("Introduce el tercer número: ");
        int num3 = teclado.nextInt();


        int temp;


        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }


        System.out.println("Los números ordenados son: " + num1 + ", " + num2 + ", " + num3);
    }

}
