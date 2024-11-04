//Crea un programa que escriba como texto cualquier número del 1 al 10 que introduzca el usuario. Por ejemplo,
// si el usuario introduce 3, deberá escribir "tres".

package Tarea6;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 10: ");
        int numero = sc.nextInt();

        String numeroTexto = "";
        switch (numero) {
            case 1:  numeroTexto = "uno"; break;
            case 2:  numeroTexto = "dos"; break;
            case 3:  numeroTexto = "tres"; break;
            case 4:  numeroTexto = "cuatro"; break;
            case 5:  numeroTexto = "cinco"; break;
            case 6:  numeroTexto = "seis"; break;
            case 7:  numeroTexto = "siete"; break;
            case 8:  numeroTexto = "ocho"; break;
            case 9:  numeroTexto = "nueve"; break;
            case 10: numeroTexto = "diez"; break;
            default: numeroTexto = "Número no válido"; break;
        }

        System.out.println("El número es: " + numeroTexto);
    }

}
