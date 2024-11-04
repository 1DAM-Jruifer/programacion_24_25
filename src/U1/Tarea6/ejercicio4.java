//Crea un programa que pida dos números de tipo byte al usuario y cree a una variable "menor",
// que tenga el valor del menor de esos dos números. Hazlo primero con un "if" y luego con un "operador condicional".

package U1.Tarea6;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número (byte): ");
        byte num1 = sc.nextByte();
        System.out.print("Introduce el segundo número (byte): ");
        byte num2 = sc.nextByte();

        byte menor;
        if (num1 < num2) {
            menor = num1;
        } else {
            menor = num2;
        }

        System.out.println("El menor es: " + menor);
    }

}
