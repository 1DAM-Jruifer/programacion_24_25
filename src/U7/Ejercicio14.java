//Actividad 14: Implementar la función leeCadena con el siguiente prototipo:
//
//List<Character> leeCadena()
//Dicha función lee una cadena por teclado y nos la devuelve en una lista con un carácter en cada nodo.

package U7;

import java.util.*;

public class Ejercicio14 {

    public static void main(String[] args) {

        List<Character> listaDeCaracteres = leeCadena();
        System.out.println("Cadena leída como lista de caracteres: " + listaDeCaracteres);
    }

    public static List<Character> leeCadena() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();

        List<Character> listaCaracteres = new ArrayList<>();

        for (int i = 0; i < cadena.length(); i++) {
            listaCaracteres.add(cadena.charAt(i));
        }

        return listaCaracteres;
    }
}
