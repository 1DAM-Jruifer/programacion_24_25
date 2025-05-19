//Actividad 6 parte 2: En un fichero binario, sabemos que se ha guardado una serie de números double, pero no sabemos cuántos.
// Implementar un programa que los lea todos y los muestre por pantalla.

package U6;

import java.io.*;

public class Ejercicio14 {

    public static void main(String[] args) {
        String nombreArchivo = "doubles.bin";

        try (DataInputStream dis = new DataInputStream(new FileInputStream(nombreArchivo))) {
            System.out.println("Contenido del archivo:");

            while (dis.available() > 0) {
                double numero = dis.readDouble();
                System.out.println(numero);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
