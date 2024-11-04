package U1.Tarea2;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Intoduzca en grados centigrados:");
        int gradoscentigrados = teclado.nextInt();


        int  Fahrenheit = 9* gradoscentigrados/5 + 32;
        System.out.println(Fahrenheit);
    }

}
