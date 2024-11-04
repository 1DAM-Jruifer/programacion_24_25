//Realizar un aplicación que genere un número aleatorio entre 1 y 100. El jugador debe ir probando números tratando de acertarlo.
// El programa debe indicar "mayor" o "menor" según el número secreto sea mayor o menor que el introducido por el usuario. El proceso finaliza cuando el usuario acierta o
// cuando se rinde (introduciendo un -1).

package U1.Tarea8;
import java.util.Scanner;
import java.util.Random;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;

        do {
            System.out.print("Adivina el número (1-100) o introduce -1 para rendirte: ");
            intento = scanner.nextInt();

            if (intento == -1) {
                System.out.println("Te has rendido. El número secreto era: " + numeroSecreto);
                break;
            }

            if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Has acertado!");
            }
        } while (intento != numeroSecreto);


    }

}
