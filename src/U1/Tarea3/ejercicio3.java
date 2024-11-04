package U1.Tarea3;
import java.util.Scanner;
public class ejercicio3 {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduzca el primer numero:");
        double primernumero = teclado.nextInt();
        System.out.println("Introduzca el segundo numero");
        double segundonumero = teclado.nextInt();


        System.out.println("Su resultado es:");
        System.out.println(primernumero/segundonumero);
    }

}
