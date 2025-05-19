//Actividad 3 parte 2: Pedir números enteros positivos por consola y guardarlos en
// un fichero binario hasta que se introduzca un número negativo.
// Leer del fichero todos los enteros guardados y mostrarlos por pantalla.

package U6;

import java.io.*;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        String nombreArchivo = "numeros.bin";
        guardarNumeros(nombreArchivo);
        leerNumeros(nombreArchivo);
    }

    private static void guardarNumeros(String nombreArchivo) {
        Scanner scanner = new Scanner(System.in);

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(nombreArchivo))) {
            System.out.println("Introduce números enteros positivos (negativo para terminar):");

            while (true) {
                System.out.print("> ");
                int numero = scanner.nextInt();
                if (numero < 0) break;
                dos.writeInt(numero);
            }

            System.out.println("Números guardados en " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    private static void leerNumeros(String nombreArchivo) {
        System.out.println("\nLeyendo números del archivo...");

        try (DataInputStream dis = new DataInputStream(new FileInputStream(nombreArchivo))) {
            while (true) {
                int numero = dis.readInt();
                System.out.println(numero);
            }
        } catch (EOFException e) {
            System.out.println("Fin de la lectura.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
