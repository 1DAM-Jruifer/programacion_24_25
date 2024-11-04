//Crea un programa que pida tres números enteros largos al usuario y diga cuál es el mayor de los tres.

package Tarea5;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Escribe un numero largo: ");
        int numero = scanner.nextInt();
        System.out.print("Escribe un numero largo: ");
        int numero2 = scanner.nextInt();
        System.out.print("Escribe un numero largo: ");
        int numero3 = scanner.nextInt();


        int largo = numero;


        if (numero2 > largo)
            largo = numero2;
        if (numero3 > largo)
            largo = numero3;


        System.out.println("El mayor de los tres es:" + largo);
    }
}
