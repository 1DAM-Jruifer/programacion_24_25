//Crea un programa que contenga una constante llamada gravedad=9,8, solicite al usuario el valor de "tiempo", y calcule y muestre la velocidad (velocidad=gravedad x tiempo).
// Nota: si el valor del tiempo es negativo o 0, se mostrará el mensaje "Tiempo incorrecto"

package Tarea5;
import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        double gravedad = 9.8;


        System.out.print("Escribe el valor de tiempo: ");
        double tiempo = teclado.nextInt();


        double velocidad = 9.8 * tiempo;
        System.out.println("La velocidad es de: " + velocidad );


    }
}


