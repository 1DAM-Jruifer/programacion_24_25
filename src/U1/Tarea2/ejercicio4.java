package U1.Tarea2;
import java.util.Scanner;
public class ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduzca una longitud en millas:");
        int millas = teclado.nextInt();


        int metros = millas * 1609;
        System.out.println("En metros es: " + metros);
    }
}