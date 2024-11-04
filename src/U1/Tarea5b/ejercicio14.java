//Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado que podrá ser una letra,
// un número o un símbolo como *, +, -, $, &,etc. El programa debe permitir al usuario mediante un menú elegir si el vértice de la pirámide está apuntando hacia arriba,
// hacia abajo, hacia la izquierda o hacia la derecha.

package U1.Tarea5b;
import java.util.Scanner;
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un carácter para la pirámide: ");
        char caracter = teclado.next().charAt(0);


        System.out.print("Introduce la altura de la pirámide: ");
        int altura = teclado.nextInt();


        System.out.println("Selecciona la dirección de la pirámide:");
        System.out.println("1. Arriba");
        System.out.println("2. Abajo");
        System.out.println("3. Izquierda");
        System.out.println("4. Derecha");
        System.out.print("Opción: ");
        int opcion = teclado.nextInt();




        switch (opcion) {
            case 1: // Pirámide hacia arriba
                for (int i = 0; i < altura; i++) {
                    for (int j = altura - i; j > 1; j--) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j <= i; j++) {
                        System.out.print(caracter + " ");
                    }
                    System.out.println();
                }
                break;


            case 2: // Pirámide hacia abajo
                for (int i = altura; i > 0; i--) {
                    for (int j = altura - i; j > 0; j--) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print(caracter + " ");
                    }
                    System.out.println();
                }
                break;


            case 3: // Pirámide hacia la izquierda
                for (int i = 0; i < altura; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                break;


            case 4: // Pirámide hacia la derecha
                for (int i = 0; i < altura; i++) {
                    for (int j = altura - i; j > 1; j--) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j <= i; j++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                break;


            default:
                System.out.println("Opción no válida.");
        }




    }

}
