//Diseñar una aplicación que pida al usuario su nombre y edad. Estos datos deben guardarse en el fichero "datos.txt".
// Si este fichero existe, debe borrarse su contenido, y en caso de no existir, debe crearse.

package U6;

import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        String nombreFichero = "datos.txt";

        try (FileWriter writer = new FileWriter(nombreFichero, false)) { // 'false' para sobrescribir el archivo
            writer.write("Nombre: " + nombre + "\n");
            writer.write("Edad: " + edad + "\n");
            System.out.println("Datos guardados correctamente en " + nombreFichero);
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }

}
