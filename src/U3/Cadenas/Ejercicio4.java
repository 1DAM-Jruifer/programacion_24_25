//Diseñar una actividad que pida al usuario que introduzca una frase por teclado e indique cuántos espacios en blanco tiene.

package U3.Cadenas;

import java.util.Scanner;

public class Ejercicio4 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Por favor, introduce una frase:");
            String frase = scanner.nextLine();

            int contadorEspacios = 0;

            for (int i = 0; i < frase.length(); i++) {

                if (frase.charAt(i) == ' ') {
                    contadorEspacios++;
                }
            }

            System.out.println("La frase contiene " + contadorEspacios + " espacio(s) en blanco.");

        }
    }
