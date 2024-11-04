//Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares.

package U1.Tarea5;
import java.util.Scanner;
public class ejercicio4 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.print("Escribe un numero entero: ");
    int numero = scanner.nextInt();
    System.out.print("Escribe un numero entero: ");
    int numero2 = scanner.nextInt();


    if (numero %2 == 0){
        System.out.println("El número es par.");
    } else{
        System.out.println("El número no es par.");
    }
    if (numero2 %2 == 0){
        System.out.println("El número es par.");
    } else {
        System.out.println("El número no es par.");
    }
}

}
