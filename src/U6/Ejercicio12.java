//Actividad 4 parte 2: Pedir un entero n por consola. A continuación, pedir n números double, que iremos guardando en una tabla.
// Guardar la tabla en un archivo binario.

package U6;

import java.io.*;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreArchivo = "doubles.bin";


        System.out.print("Introduce la cantidad de números (n): ");
        int n = scanner.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(nombreArchivo))) {
            dos.writeInt(n);
            for (double numero : numeros) {
                dos.writeDouble(numero);
            }
            System.out.println("Números guardados en " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
