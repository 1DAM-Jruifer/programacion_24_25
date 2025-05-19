//Actividad 4: Realizar un programa que lea un fichero de texto llamado carta.txt, tenemos que contar los caracteres,
// las líneas y las palabras. Para facilitar el procesamiento supondremos que cada palabra está separada de otra por un único espacio en blanco.

package U6;

import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;

public class Ejercicio4 {
    public static void main(String[] args) {
        String nombreFichero = "carta.txt";
        int numCaracteres = 0;
        int numPalabras = 0;
        int numLineas = 0;

        File archivo = new File(nombreFichero);
        if (!archivo.exists() || !archivo.isFile()) {
            System.out.println("El fichero no existe o no es válido.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                numLineas++;
                numCaracteres += linea.length();
                numPalabras += linea.split(" ").length;
            }

            System.out.println("Número de caracteres: " + numCaracteres);
            System.out.println("Número de palabras: " + numPalabras);
            System.out.println("Número de líneas: " + numLineas);
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}
