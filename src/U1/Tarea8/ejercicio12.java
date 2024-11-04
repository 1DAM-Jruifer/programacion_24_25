//Pedir 5 calificaciones de alumnos. El programa debe decir, al final, si hay algún suspenso o no lo hay. Nota: cuidado, si hay 2 suspensos, no debe decirlo dos veces.

package U1.Tarea8;
import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean haySuspenso = false;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce la calificación del alumno " + i + ": ");
            int calificacion = scanner.nextInt();

            if (calificacion < 5) {
                haySuspenso = true;
            }
        }

        if (haySuspenso) {
            System.out.println("Hay al menos un suspenso.");
        } else {
            System.out.println("No hay suspensos.");
        }

    }

}
