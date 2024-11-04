//Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente, bien, notable o sobresaliente).

package U1.Tarea5b;
import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduzca la primera nota:");
        int primernumero = teclado.nextInt();
        System.out.println("Introduzca la segunda nota");
        int segundonumero = teclado.nextInt();
        System.out.println("Introduzca la tercera nota");
        int tercernumero = teclado.nextInt();


        int suma = primernumero + segundonumero + tercernumero;
        int media = suma / 3;


        System.out.println("Su resultado es:" + media);




        if (media < 4) {
            System.out.println("Su resultado es insuficiente");


            if (media == 5) {
                System.out.println("Su resultado es suficiente");
            }


            if (media == 6) {
                System.out.println("Su resultado es notable");
            }
            if (media > 9) {
                System.out.println("Su resultado es sobresaliente");
            }


        }


    }

}
