//Calcula la nota de un trimestre de la asignatura Programación.
// El programa pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
// Si la media de los dos controles da un número mayor o igual a 5, el alumno está aprobado y se mostrará la media.
// En caso de que la media sea un número menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se califica como apto o no apto,
// por tanto se debe preguntar al usuario ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el resultado de la recuperación es apto, la nota será un 5;
// en caso contrario, se mantiene la nota media anterior.

package U1.Tarea5b;
import java.util.Scanner;
public class ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);




        System.out.print("Introduce la primera nota: ");
        int nota1 = teclado.nextInt();


        System.out.print("Introduce la segunda nota: ");
        int nota2 = teclado.nextInt();


        int suma = nota1 + nota2;
        int media = suma/2;


        System.out.println("Su resultado es:"+ media);


        if (media <5) {
            System.out.println("No apto");
        }else{
            System.out.println("Apto");}
    }

}
