//Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
// El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá
// “La caja fuerte se ha abierto satisfactoriamente” Tendremos cuatro oportunidades para abrir la caja fuerte.

package U1.Tarea8b;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int COMBINACION_CORRECTA = 1234;
        int intentos = 4;

        while (intentos > 0) {
            System.out.print("Introduce la combinación de la caja fuerte: ");
            int combinacion = scanner.nextInt();

            if (combinacion == COMBINACION_CORRECTA) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                break;
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Lo siento, esa no es la combinación. Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Lo siento, has agotado todos los intentos.");
                }
            }
        }

    }

}
