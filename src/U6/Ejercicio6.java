//Actividad 6: Un libro de firmas es útil para recoger todas las personas que han pasado por un determinado lugar.
// Crear una aplicación que permita mostrar el libro de firmas o insertar un nuevo nombre
// (comprobando que no se encuentre repetido). Llamaremos al fichero firmas.txt.

package U6;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.HashSet;

public class Ejercicio6 {

    private static final String NOMBRE_FICHERO = "firmas.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una opción:");
        System.out.println("1. Mostrar libro de firmas");
        System.out.println("2. Insertar nueva firma");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        if (opcion == 1) {
            mostrarFirmas();
        } else if (opcion == 2) {
            System.out.print("Introduce tu nombre para firmar: ");
            String nombre = scanner.nextLine().trim();
            agregarFirma(nombre);
        } else {
            System.out.println("Opción no válida.");
        }
    }

    private static void mostrarFirmas() {
        File archivo = new File(NOMBRE_FICHERO);
        if (!archivo.exists()) {
            System.out.println("El libro de firmas está vacío.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            System.out.println("Libro de Firmas:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }

    private static void agregarFirma(String nombre) {
        File archivo = new File(NOMBRE_FICHERO);
        HashSet<String> firmas = new HashSet<>();

        if (archivo.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    firmas.add(linea.trim());
                }
            } catch (IOException e) {
                System.out.println("Error al leer el fichero: " + e.getMessage());
                return;
            }
        }

        if (firmas.contains(nombre)) {
            System.out.println("Este nombre ya ha firmado previamente.");
        } else {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
                bw.write(nombre);
                bw.newLine();
                System.out.println("Firma añadida correctamente.");
            } catch (IOException e) {
                System.out.println("Error al escribir en el fichero: " + e.getMessage());
            }
        }
    }
}
