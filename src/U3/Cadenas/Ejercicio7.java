//Diseñar el juego "Acierta la contraseña". El primer jugador introduce una contraseña, el segundo,
// debe insertar otra intentando acertarla con las pistas que le dará el programa: número de caracteres, primera y última letra.
// se debe escribir "Acertaste" o "Menor" o "Mayor", según la palabra introducida sea menor alfabéticamente que la contraseña, o mayor.

package U3.Cadenas;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la contraseña: ");
        String contrasena = scanner.nextLine();

        System.out.println("Intenta adivinar la contraseña.");

        int longitud = contrasena.length();
        char primeraLetra = contrasena.charAt(0);
        char ultimaLetra = contrasena.charAt(longitud - 1);

        System.out.println("Pistitas:");
        System.out.println("1. La contraseña tiene " + longitud + " caracteres.");
        System.out.println("2. La primera letra es: " + primeraLetra);
        System.out.println("3. La última letra es: " + ultimaLetra);

        System.out.print("Introduce tu intento: ");
        String intento = scanner.nextLine();
    }
}
