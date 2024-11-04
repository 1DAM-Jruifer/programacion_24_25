//Realiza un programa que calcule el precio de un desayuno.
// El programa preguntará primero qué ha tomado el usuario de comer: palmera, donut o pitufo. La palmera vale 1.40 € y el donut 1 €.
// En caso de tomar pitufo, el programa debe preguntar además si era con aceite o con tortilla; el primero vale 1’20 € y el segundo 1’60 €.
// Por último se pregunta por la bebida: zumo o café a 1’50 y 1’20 respectivamente.

package U1.Tarea5b;
import java.util.Scanner;
public class ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precioComida = 0;
        double precioBebida = 0;

        System.out.print("¿Qué has tomado de comer? (palmera, donut, pitufo): ");
        String comida = scanner.nextLine().toLowerCase();

        switch (comida) {
            case "palmera":
                precioComida = 1.40;
                break;
            case "donut":
                precioComida = 1.00;
                break;
            case "pitufo":
                System.out.print("¿Cómo era el pitufo? (aceite, tortilla): ");
                String tipoPitufo = scanner.nextLine().toLowerCase();
                if (tipoPitufo.equals("aceite")) {
                    precioComida = 1.20;
                } else if (tipoPitufo.equals("tortilla")) {
                    precioComida = 1.60;
                } else {
                    System.out.println("Opción de pitufo no válida.");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Opción de comida no válida.");
                scanner.close();
                return;
        }

        System.out.print("¿Qué has tomado de bebida? (zumo, café): ");
        String bebida = scanner.nextLine().toLowerCase();

        switch (bebida) {
            case "zumo":
                precioBebida = 1.50;
                break;
            case "café":
                precioBebida = 1.20;
                break;
            default:
                System.out.println("Opción de bebida no válida.");
                scanner.close();
                return;
        }

        double precioTotal = precioComida + precioBebida;
        System.out.printf("El precio total de tu desayuno es: %.2f €%n", precioTotal);

    }

}
