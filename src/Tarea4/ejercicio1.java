package Tarea4;
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduzca el primer numero:");
        double primernumero = teclado.nextInt();
        System.out.println("Introduzca el segundo numero");
        double segundonumero = teclado.nextInt();


        double suma = primernumero + segundonumero;
        double media = suma / 2;


        System.out.println("Su resultado es:" + media);

    }
}