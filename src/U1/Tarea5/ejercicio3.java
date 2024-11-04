// Crea un programa que diga si el número introducido por el usuario es impar o no lo es.

package U1.Tarea5;
import java.util.Scanner;
public class ejercicio3 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.print("Escribe un numero: ");
    int numero = scanner.nextInt();


    if (numero %2 == 0){
        System.out.println("El número es par.");
    } else{
        System.out.println("El número no es par.");
    }


}

}
