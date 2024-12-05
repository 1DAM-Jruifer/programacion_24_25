//Diseñar un programa que pida una frase al usuario, e indique si el carácter de la posición central es o no un espacio.

package U3.Cadenas;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine();


        if (frase.isEmpty()) {
            System.out.println("La frase está vacía.");
        } else {

            int longitud = frase.length();
            int posicionCentral = longitud / 2;


            char caracterCentral = frase.charAt(posicionCentral);


            if (caracterCentral == ' ') {
                System.out.println("El carácter en la posición central es un espacio.");
            } else {
                System.out.println("El carácter en la posición central NO es un espacio.");
            }
        }
    }
}

