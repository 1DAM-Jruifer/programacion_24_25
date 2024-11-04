package U1.Tarea3;
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escrebe un numero para sumar:");
        int numero = teclado.nextInt();


        System.out.println("Escibe un segundo numero para sumar:");
        int numero2 = teclado.nextInt();




        System.out.println("El resultado es: " + (numero + numero2));
    }
}
