//Actividad 5: En el archivo numeros.txt disponemos de una serie de números (uno por cada línea).
// Diseñar un programa que procese el fichero y nos muestre el menor y el mayor.

package U6;

import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;

public class Ejercicio5 {

    public static void main(String[] args) {
        String nombreFichero = "numeros.txt";
        int menor = Integer.MAX_VALUE;
        int mayor = Integer.MIN_VALUE;

        File archivo = new File(nombreFichero);
        if (!archivo.exists() || !archivo.isFile()) {
            System.out.println("El fichero no existe o no es válido.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            boolean hayNumeros = false;
            while ((linea = br.readLine()) != null) {
                try {
                    int numero = Integer.parseInt(linea.trim());
                    if (numero < menor) menor = numero;
                    if (numero > mayor) mayor = numero;
                    hayNumeros = true;
                } catch (NumberFormatException e) {
                    System.out.println("Línea ignorada (no es un número válido): " + linea);
                }
            }

            if (hayNumeros) {
                System.out.println("Número menor: " + menor);
                System.out.println("Número mayor: " + mayor);
            } else {
                System.out.println("No se encontraron números válidos en el fichero.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}
