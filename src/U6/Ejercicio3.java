//Crear un programa que duplique el conenido de un fichero. Realizar dos versiones:
//
//Duplicaremos el fichero original.txt en uno que se llame copia.txt
//Pedir el nombre del fichero fuente y duplicarlo en un fichero con el mismo nombre con el prefijo "copia_de".

package U6;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Ejercicio3 {

    public class DuplicarFichero {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            duplicarFichero("original.txt", "copia.txt");

            System.out.print("Introduce el nombre del fichero a duplicar: ");
            String nombreFichero = scanner.nextLine().trim();
            if (!nombreFichero.isEmpty()) {
                String nombreCopia = "copia_de_" + nombreFichero;
                duplicarFichero(nombreFichero, nombreCopia);
            } else {
                System.out.println("No se ingresó un nombre de fichero válido.");
            }
        }

        public static void duplicarFichero(String fuente, String destino) {
            File archivoFuente = new File(fuente);
            if (!archivoFuente.exists() || !archivoFuente.isFile()) {
                System.out.println("El fichero " + fuente + " no existe o no es válido.");
                return;
            }

            try (BufferedReader br = new BufferedReader(new FileReader(archivoFuente));
                 BufferedWriter bw = new BufferedWriter(new FileWriter(destino))) {

                String linea;
                while ((linea = br.readLine()) != null) {
                    bw.write(linea);
                    bw.newLine();
                }
                System.out.println("Fichero duplicado correctamente en " + destino);
            } catch (IOException e) {
                System.out.println("Error al duplicar el fichero: " + e.getMessage());
            }
        }
    }
}
