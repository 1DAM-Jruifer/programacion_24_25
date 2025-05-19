//Actividad 7: Introducir por teclado, hasta que se introduzca "fin", una serie de nombres
// que se insertarán por orden alfabético en una colección que no permita repeticiones.
// Mostrar luego la lista de nombres por pantalla.

package U7;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> nombres = new TreeSet<>();

        System.out.println("Introduce nombres (escribe 'fin' para terminar):");

        while (true) {
            String nombre = scanner.nextLine().trim();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            nombres.add(nombre);
        }

        scanner.close();

        System.out.println("Nombres almacenados en orden alfabético:");
        System.out.println(nombres);
    }
}
