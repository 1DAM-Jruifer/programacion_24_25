package Tarea3;
import java.util.Scanner;
public class ejercicio4 {public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);


    System.out.println("Introduzca una longitud en millas:");
    float millas = teclado.nextInt();


    float kilometros = millas * 1609;
    System.out.println("En kilometros es: " + kilometros);
}

}
