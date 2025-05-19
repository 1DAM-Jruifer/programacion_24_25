//Actividad 8: Disponemos de dos ficheros perso1.txt y perso2.txt con nombres de personas (ambos ordenados).
// Realizar un programa que lea ambos ficheros y que cree un tercer fichero (todos.txt)
// con todos los nombres ordenados alfabéticamente.

package U6;

import java.io.*;

public class Ejercicio8 {

    public static void main(String[] args) {
        String archivo1 = "perso1.txt";
        String archivo2 = "perso2.txt";
        String archivoSalida = "todos.txt";

        try (BufferedReader br1 = new BufferedReader(new FileReader(archivo1));
             BufferedReader br2 = new BufferedReader(new FileReader(archivo2));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida))) {

            String linea1 = br1.readLine();
            String linea2 = br2.readLine();

            // Fusionar manteniendo el orden
            while (linea1 != null || linea2 != null) {
                if (linea1 == null) {  // Si ya no hay más líneas en el primer archivo
                    bw.write(linea2);
                    bw.newLine();
                    linea2 = br2.readLine();
                } else if (linea2 == null) {  // Si ya no hay más líneas en el segundo archivo
                    bw.write(linea1);
                    bw.newLine();
                    linea1 = br1.readLine();
                } else if (linea1.compareToIgnoreCase(linea2) <= 0) { // Compara alfabéticamente
                    bw.write(linea1);
                    bw.newLine();
                    linea1 = br1.readLine();
                } else {
                    bw.write(linea2);
                    bw.newLine();
                    linea2 = br2.readLine();
                }
            }

            System.out.println("Fusión completada. Archivo generado: " + archivoSalida);
        } catch (IOException e) {
            System.out.println("Error al manejar los archivos: " + e.getMessage());
        }
    }
}
