//Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes o buenas noches según la hora.
// Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5.
// respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.

package U1.Tarea5b;
import java.util.Scanner;
public class ejercicio2 {public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int hora;


    System.out.print("Introduce una hora (0-23): ");
    hora = teclado.nextInt();


    String saludo;


    if (hora >= 6 && hora < 12) {
        saludo = "¡Buenos días!";
    } else if (hora >= 13 && hora < 21) {
        saludo = "¡Buenas tardes!";
    } else {
        saludo = "¡Buenas noches!";
    }



    if (hora < 0 || hora > 23) {
        System.out.println("Hora no válida. Debe estar entre 0 y 23.");
    } else {
        System.out.println(saludo);
    }
}
}
