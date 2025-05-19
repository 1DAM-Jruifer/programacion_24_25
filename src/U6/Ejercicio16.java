//Actividad 8 parte 2: Crear una tabla de números aleatorios menores que 100, ordenados de menor a mayor, y guardarlos
// en un fichero binario. A continuación, recuperarlos y mostrarlos por consola.

package U6;

import java.io.*;
import java.util.*;

public class Ejercicio16 {
    public static void main(String[] args) {
        String nombreArchivo = "numerosAleatorios.bin";

        guardarNumerosAleatorios(nombreArchivo);

        leerNumerosAleatorios(nombreArchivo);
    }

    private static void guardarNumerosAleatorios(String nombreArchivo) {
        Random random = new Random();
        int cantidad = 10;
        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(100);
        }

        Arrays.sort(numeros);

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(nombreArchivo))) {
            dos.writeInt(cantidad);
            for (int numero : numeros) {
                dos.writeInt(numero);
            }
            System.out.println("Números aleatorios guardados en " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar los números: " + e.getMessage());
        }
    }

    private static void leerNumerosAleatorios(String nombreArchivo) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(nombreArchivo))) {
            int cantidad = dis.readInt();
            System.out.println("Cantidad de números: " + cantidad);
            System.out.println("Contenido del archivo:");

            for (int i = 0; i < cantidad; i++) {
                int numero = dis.readInt();
                System.out.println("Número " + (i + 1) + ": " + numero);
            }
        } catch (IOException e) {
            System.out.println("Error al leer los números: " + e.getMessage());
        }
    }

}
