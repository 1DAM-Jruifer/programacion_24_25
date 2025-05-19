//Actividad 5 parte 2: Leer de un fichero binario una tabla de números double. Mostrar el contenido de la tabla por consola.

package U6;

import java.io.*;

public class Ejercicio13 {

    public static void main(String[] args) {
        String nombreArchivo = "doubles.bin";

        try (DataInputStream dis = new DataInputStream(new FileInputStream(nombreArchivo))) {

            int n = dis.readInt();
            System.out.println("Cantidad de números: " + n);

            System.out.println("Contenido de la tabla:");
            for (int i = 0; i < n; i++) {
                double numero = dis.readDouble();
                System.out.println("Número " + (i + 1) + ": " + numero);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
