package U1.Tarea3;
import java.util.Scanner;
public class ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("En que año naciste?:");
        int año = teclado.nextInt();
        System.out.println("En que años estamos?:");
        int año2 = teclado.nextInt();


        System.out.println("Tu edad es de:" + (año2 - año));
    }
}
