//Crea un programa que pida un número entero al usuario y diga si es positivo (mayor que cero) o si, por el contrario, no lo es (usando "else").

package U1.Tarea5;
import java.util.Scanner;
public class ejercicio1 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.print("Por favor, ingresa un número entero: ");
    int numero = scanner.nextInt();


    if (numero > 0) {
        System.out.println("El número es positivo.");
    } else {
        System.out.println("El número no es positivo.");
    }


}

}
