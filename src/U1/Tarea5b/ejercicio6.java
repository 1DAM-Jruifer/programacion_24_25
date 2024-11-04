//Realiza un programa que calcule la media de tres notas que se solicitarán al usuario.

package U1.Tarea5b;
import java.util.Scanner;
public class ejercicio6 {public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);




    System.out.println("Introduzca la primera nota:");
    int primernumero = teclado.nextInt();
    System.out.println("Introduzca la segunda nota");
    int segundonumero = teclado.nextInt();
    System.out.println("Introduzca la tercera nota");
    int tercernumero = teclado.nextInt();




    int suma = primernumero + segundonumero + tercernumero;
    int media = suma/3;




    System.out.println("Su resultado es:"+ media);




}

}
