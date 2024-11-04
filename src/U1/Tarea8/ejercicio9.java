//Un centro de investigación de la flora urbana necesita una aplicación que muestre cual es el árbol más alto. Para ello se introducirán por teclado las alturas en cms de cada árbol,
// terminando cuando se introduzca -1. Los árboles se identifican mediante etiquetas con números correlativos, comenzando en 0.

package U1.Tarea8;
import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura, mayorAltura = 0, etiquetaMayorAltura = -1, etiqueta = 0;

        while (true) {
            System.out.print("Introduce la altura del árbol (en cms, -1 para terminar): ");
            altura = scanner.nextInt();

            if (altura == -1) {
                break;
            }

            if (altura > mayorAltura) {
                mayorAltura = altura;
                etiquetaMayorAltura = etiqueta;
            }
            etiqueta++;
        }

        if (etiquetaMayorAltura != -1) {
            System.out.println("El árbol más alto es el árbol con etiqueta " + etiquetaMayorAltura + " y una altura de " + mayorAltura + " cms.");
        } else {
            System.out.println("No se han introducido alturas.");
        }


    }

}
