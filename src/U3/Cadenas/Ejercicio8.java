//Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre comienzan sus frases con "Javalín, javalón",
// para después hacer una pausa más o menos larga (la pausa se representa mediante espacios en blanco) y a continuación expresan el mensaje.
// Existe un dialecto que no comienza sus frases con la muletilla anterior, pero siempre las terminan con un silencio,
// más o menos prolongado y la coletilla "javalén, len, len". Se pide diseñar un traductor que, en primer lugar,
// nos diga si la frase está escrita en el idioma de Javalandia (en cualquiera de sus dialectos), y en caso afirmativo,
// nos muestre el mensaje sin muletillas.

package U3.Cadenas;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la frase: ");
        String frase = scanner.nextLine();

        if (esDialectojavalandia(frase)) {

            String mensaje = limpiarFrase(frase);
            System.out.println("Mensaje: " + mensaje);
        } else {
            System.out.println("La frase no está en el idioma de Javalandia.");
        }
    }

    public static boolean esDialectojavalandia(String frase) {

        if (frase.startsWith("Javalín, javalón") && frase.length() > "Javalín, javalón".length() && frase.charAt("Javalín, javalón".length()) == ' ') {
            return true;
        }

        if (frase.endsWith("javalén, len, len") && frase.length() > "javalén, len, len".length()) {
            return true;
        }

        return false;
    }

    public static String limpiarFrase(String frase) {

        if (frase.startsWith("Javalín, javalón")) {

            return frase.substring("Javalín, javalón".length()).trim();
        }
        if (frase.endsWith("javalén, len, len")) {

            return frase.substring(0, frase.length() - "javalén, len, len".length()).trim();
        }
        return frase;
    }
}
