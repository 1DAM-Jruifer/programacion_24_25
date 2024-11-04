package Tarea2;
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduzca el primer numero:");
        int primernumero = teclado.nextInt();
        System.out.println("Introduzca el segundo numero");
        int segundonumero = teclado.nextInt();


        System.out.println("Su resultado es:");
        System.out.println(primernumero/segundonumero);
    }
}
