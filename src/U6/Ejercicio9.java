//Actividad 1 parte 2: Pedir un double por consola y guardarlo en un archivo binario.

package U6;

import java.io.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        String nombreArchivo = "numero.bin";

        try (DataInputStream dis = new DataInputStream(new FileInputStream(nombreArchivo))) {
            double numero = dis.readDouble();
            System.out.println("Número leído: " + numero);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
