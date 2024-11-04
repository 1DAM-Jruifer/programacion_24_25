//Crea un programa que pida al usuario que introduzca el número 12. Después debe decirle si lo ha hecho correctamente o no.

package Tarea5;
import java.util.Scanner;
public class ejercicio2 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.print("Escribe 12: ");
    int numero = scanner.nextInt();


    if (numero != 12){
        System.out.println("El número no es 12.");
    } else{
        System.out.println("El número es 12.");
    }


}

}
