package U3.RECUPERACIÓN;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la altura de la pecera (Min 4): ");
        int anchura = scanner.nextInt();

        System.out.println("Introduce la anchura de la pecera (Min 4): ");
        int altura = scanner.nextInt();

        if (altura <4 || anchura < 4) {
            System.out.println("Error: Los datos deben ser mayor a 4.");
        } else{

            for (int i = 1; i < anchura ; i++) {
                System.out.println("*");
            }

            for (int i = 1; i < altura + 1 ; i++) {
                System.out.print("* ");
            }

            }
        }
    }
