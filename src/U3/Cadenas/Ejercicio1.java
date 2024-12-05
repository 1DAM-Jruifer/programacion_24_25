package U3.Cadenas;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");

        String palabra = teclado.next();

        System.out.println("Introduce otra palabra: ");

        String palabra2 = teclado.next();

        if (palabra.length()<palabra2.length()){
            System.out.println("La palabra 1 es más corta");
        }else {
            System.out.println("La palabra 2 es más corta");
        }
    }
}
