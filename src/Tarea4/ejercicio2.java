package Tarea4;
import java.util.Scanner;
public class ejercicio2 {public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);


    System.out.println("Introduzca el primer numero:");
    int primernumero = teclado.nextInt();
    System.out.println("Introduzca el segundo numero");
    int segundonumero = teclado.nextInt();
    System.out.println("Introduzca el tercer numero");
    int tercernumero = teclado.nextInt();


    int suma = primernumero + segundonumero + tercernumero;
    int media = suma/3;


    System.out.println("Su resultado es:"+ media);


}

}
