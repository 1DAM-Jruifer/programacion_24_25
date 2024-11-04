package Tarea4;
import java.util.Scanner;
public class ejercicio4 {public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);


    System.out.println("Introduzca un numero decimal:");


    float num = teclado.nextFloat();


    System.out.println("Tu numero redondeado es:" + (Math.round(num)));
}

}
