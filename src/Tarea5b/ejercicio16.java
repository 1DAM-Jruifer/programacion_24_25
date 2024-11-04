//Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.

package Tarea5b;
import java.util.Scanner;
public class ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.print("Introduce un número entero: ");
        int numero = teclado.nextInt();


        int ultimaCifra = Math.abs(numero % 10);


        System.out.println("La última cifra del número " + numero + " es: " + ultimaCifra);
    }

}
