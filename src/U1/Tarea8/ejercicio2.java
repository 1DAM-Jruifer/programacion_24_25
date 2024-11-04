//Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos estadísticos de los alumnos. Se introducirán las edades de los alumnos hasta que una de ellas sea negativa.
// La aplicación mostrará la suma de las edades, la media de las edades, y cuántos alumnos son mayores de edad.

package U1.Tarea8;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        int suma = 0, contador = 0, mayoresDeEdad = 0;

        System.out.print("Introduce una edad (negativa para terminar): ");
        edad = scanner.nextInt();

        while (edad >= 0) {
            suma += edad;
            contador++;

            if (edad >= 18) {
                mayoresDeEdad++;
            }

            System.out.print("Introduce una edad (negativa para terminar): ");
            edad = scanner.nextInt();
        }

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("Suma de las edades: " + suma);
            System.out.println("Media de las edades: " + media);
            System.out.println("Número de alumnos mayores de edad: " + mayoresDeEdad);
        } else {
            System.out.println("No se han introducido edades válidas.");
        }
//Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos estadísticos de los alumnos. Se introducirán las edades de los alumnos hasta que una de ellas sea negativa.
// La aplicación mostrará la suma de las edades, la media de las edades, y cuántos alumnos son mayores de edad.
    }

}
