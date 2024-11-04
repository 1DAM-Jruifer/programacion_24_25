//Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado.
// Se permiten números de hasta 5 cifras.

package Tarea5b;
import java.util.Scanner;
public class ejercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);




        System.out.print("Introduce un número entero: ");
        int numero = teclado.nextInt();




        int primeraCifra = Math.abs(numero / 10);




        System.out.println("La primera cifra del número " + numero + " es: " + primeraCifra);
    }

}
