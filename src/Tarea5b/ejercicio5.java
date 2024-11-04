//Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).

package Tarea5b;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.print("Introduce el coeficiente a: ");
        double a = teclado.nextDouble();


        System.out.print("Introduce el término independiente b: ");
        double b = teclado.nextDouble();


        if (a == 0) {
            if (b == 0) {
                System.out.println("La ecuación tiene infinitas soluciones.");
            } else {
                System.out.println("La ecuación no tiene solución.");
            }
        } else {
            // Calcular la solución
            double x = -b / a;
            System.out.printf("La solución de la ecuación %.2fx + %.2f = 0 es: x = %.2f%n", a, b, x);
        }
    }

}
