//Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.

package Tarea8;
import java.util.Scanner;
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aprobados = 0, condicionados = 0, suspensos = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Introduce la calificación del alumno " + i + ": ");
            int nota = scanner.nextInt();

            if (nota >= 5) {
                aprobados++;
            } else if (nota == 4) {
                condicionados++;
            } else {
                suspensos++;
            }
        }

        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos condicionados: " + condicionados);
        System.out.println("Alumnos suspensos: " + suspensos);

    }

}
