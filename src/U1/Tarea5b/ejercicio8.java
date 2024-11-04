//Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0).

package U1.Tarea5b;
import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);




        System.out.print("Ingrese el coeficiente a: ");
        double a = teclado.nextDouble();


        System.out.print("Ingrese el coeficiente b: ");
        double b = teclado.nextDouble();


        System.out.print("Ingrese el coeficiente c: ");
        double c = teclado.nextDouble();




        if (a == 0) {
            System.out.println("El coeficiente 'a' no puede ser cero en una ecuación de segundo grado.");
        } else {
            resolverEcuacion(a, b, c);
        }


    }


    public static void resolverEcuacion(double a, double b, double c) {


        double discriminante = b * b - 4 * a * c;


        if (discriminante > 0) {


            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.printf("Las soluciones son: x1 = %.2f, x2 = %.2f%n", x1, x2);
        } else if (discriminante == 0) {


            double x = -b / (2 * a);
            System.out.printf("La solución es: x = %.2f%n", x);
        } else {


            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.printf("Las soluciones son complejas: x1 = %.2f + %.2fi, x2 = %.2f - %.2fi%n",
                    parteReal, parteImaginaria, parteReal, parteImaginaria);
        }
    }

}
