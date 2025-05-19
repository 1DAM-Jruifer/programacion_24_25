//Actividad 1: Realizar un programa que solicite al usuario el nombre de un fichero de texto
// y muestre su contenido en pantalla. Si no se proporciona ningún nombre de fichero,
// la aplicación utilizará por defecto prueba.txt.

package U6;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;

public class Ejercicio1 {

    public class LeerFichero {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce el nombre del fichero (o presiona Enter para usar 'prueba.txt'): ");
            String nombreFichero = scanner.nextLine().trim();

            if (nombreFichero.isEmpty()) {
                nombreFichero = "prueba.txt";
            }

            File fichero = new File(nombreFichero);
            if (!fichero.exists()) {
                System.out.println("El fichero no existe.");
                return;
            }

            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                System.out.println("Error al leer el fichero: " + e.getMessage());
            }
        }

    }
}