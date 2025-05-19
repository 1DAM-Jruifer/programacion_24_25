//Actividad 2 parte 2: Abrir el archivo del ejercicio anterior, leer el double y mostrarlo por pantalla

package U6;

import java.io.*;

public class Ejercicio10 {

    public static void main(String[] args) {
        String nombreArchivo = "numero.bin";

        try (DataInputStream dis = new DataInputStream(new FileInputStream(nombreArchivo))) {
            double numero = dis.readDouble();
            System.out.println("Número leído del archivo: " + numero);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
