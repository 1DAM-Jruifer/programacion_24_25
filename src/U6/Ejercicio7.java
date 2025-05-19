//Actividad 7: En LINUX disponemos de un comando "more", al que se le pasa un fichero y lo muestra poco a poco
// (cada 24 líneas).
// Implementar un programa que funcione de forma similar.

package U6;

import java.io.*;
import java.util.Scanner;

public class Ejercicio7 {

    private static final int LINEAS_POR_PAGINA = 24;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos el nombre del fichero
        System.out.print("Introduce el nombre del fichero: ");
        String nombreFichero = scanner.nextLine();

        File archivo = new File(nombreFichero);
        if (!archivo.exists() || !archivo.isFile()) {
            System.out.println("El archivo no existe o no es un archivo válido.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            int contador = 0;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                contador++;

                // Cada 24 líneas, pedimos al usuario que presione Enter para continuar
                if (contador % LINEAS_POR_PAGINA == 0) {
                    System.out.print("\nPresiona Enter para continuar o 'q' para salir: ");
                    String entrada = scanner.nextLine();
                    if (entrada.equalsIgnoreCase("q")) {
                        System.out.println("Saliendo...");
                        break;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }

}
