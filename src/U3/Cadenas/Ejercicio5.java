// Pedir el nombre completo (nombre y apellidos) al usuario. El programa debe eliminar cualquier vocal del nombre. Por ejemplo:
// "Álvaro Pérez" se mostrará como "lvr Prz". Sólo se eliminarán las vocales (mayúsculas, minúsculas y acentuadas).
// El resto de caracteres no se modifican.

package U3.Cadenas;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        String nombreSinVocales = eliminarVocales(nombreCompleto);

        System.out.println("Nombre sin vocales: " + nombreSinVocales);
    }

    public static String eliminarVocales(String texto) {

        String textoSinVocales = texto.replaceAll("[aeiouáéíóúAEIOUÁÉÍÓÚ]", "");
        return textoSinVocales;
    }
}