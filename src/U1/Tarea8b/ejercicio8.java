//Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
// El día de la semana se puede pedir como un número (del 1 al 7) o como una cadena (de “lunes” a “domingo”).
// Se debe comprobar que el usuario introduce los datos correctamente y que el segundo día es posterior al primero.

package U1.Tarea8b;
import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] diasHoras = {0, 24, 48, 72, 96, 120, 144};

        System.out.print("Introduce el primer día de la semana (1 a 7): ");
        int dia1 = scanner.nextInt();
        System.out.print("Introduce la hora del primer día (0 a 23): ");
        int hora1 = scanner.nextInt();

        System.out.print("Introduce el segundo día de la semana (1 a 7): ");
        int dia2 = scanner.nextInt();
        System.out.print("Introduce la hora del segundo día (0 a 23): ");
        int hora2 = scanner.nextInt();

        if (dia2 > dia1 || (dia2 == dia1 && hora2 >= hora1)) {
            int totalHoras = (diasHoras[dia2 - 1] + hora2) - (diasHoras[dia1 - 1] + hora1);
            System.out.println("Las horas transcurridas entre ambos días son: " + totalHoras);
        } else {
            System.out.println("Error: el segundo día debe ser posterior al primero.");
        }

    }

}
