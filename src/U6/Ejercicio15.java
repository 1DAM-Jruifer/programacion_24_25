//Actividad 7 parte 2: Escribir por teclado una frase y guardarla en un archivo binario.
// A continuación, recuperarla del archivo y mostrarla por pantalla.

package U6;

import java.io.*;
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        String nombreArchivo = "frase.bin";

        guardarFrase(nombreArchivo);

        leerFrase(nombreArchivo);
    }

    private static void guardarFrase(String nombreArchivo) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(nombreArchivo))) {
            dos.writeUTF(frase);
            System.out.println("Frase guardada en " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar la frase: " + e.getMessage());
        }
    }

    private static void leerFrase(String nombreArchivo) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(nombreArchivo))) {
            String fraseRecuperada = dis.readUTF();
            System.out.println("Frase recuperada del archivo: " + fraseRecuperada);
        } catch (IOException e) {
            System.out.println("Error al leer la frase: " + e.getMessage());
        }
    }
}
