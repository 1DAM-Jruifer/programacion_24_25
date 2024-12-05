//Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se especifique.
// Para distinguir un caso de otro se le pasará un número 1 (para área) o 2 (para volumen).
// Además, hemos de pasarle a la función el radio de la base y la altura.

package U3;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce 1 (area) o 2 (volumen)");
        int num = scanner.nextInt();

        if (num == 1) {
            area();
        } else {
            volumen();
        }
    }

    public static void area() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el radio: ");
        double radio = scanner.nextDouble();

        System.out.println("Introduce la altura: ");
        double altura = scanner.nextDouble();

        System.out.println("El area del cilindro: "+ 2*3.14*radio*(altura+ radio));

    }

    public static void volumen() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el radio: ");
        double radio = scanner.nextDouble();

        System.out.println("Introduce la altura: ");
        double altura = scanner.nextDouble();

        System.out.println("El volumen del cilindro: "+ 3.14*(radio*radio)*altura);

    }
}

