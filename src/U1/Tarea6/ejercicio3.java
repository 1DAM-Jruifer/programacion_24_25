//Crea un programa que pida un número entero al usuario y dé a una variable par el valor 1
// si ese número es par o el valor 0 si no es par. Hazlo primero con un "if" y luego con un "operador condicional".

package U1.Tarea6;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        int par;
        if (numero % 2 == 0) {
            par = 1;
        } else {
            par = 0;
        }

        System.out.println("El valor de 'par' es: " + par);
    }

}
