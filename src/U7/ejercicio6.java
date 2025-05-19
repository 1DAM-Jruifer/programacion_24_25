//Actividad 6: Introducir por teclado, hasta que se introduzca "fin", una serie de nombres que se insertarán
// en una colección, de forma que se conserve el orden de inserción y que no puedan repetirse.
// Mostrar la estructura por pantalla.

package U7;
import java.util.*;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> nombres = new LinkedHashSet<>();

        System.out.println("Introduce nombres (escribe 'fin' para terminar):");

        while (true) {
            String nombre = scanner.nextLine().trim();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            nombres.add(nombre);
        }

        scanner.close();

        System.out.println("Nombres almacenados:");
        System.out.println(nombres);
    }

}
