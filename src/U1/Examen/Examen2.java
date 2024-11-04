package U1.Examen;

import java.util.Scanner;

public class Examen2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;


        System.out.print("Introduce un número del 0 al 10: ");
        num = teclado.nextInt();


        String nombreNum;


        switch (num) {
            case 1:
                nombreNum = "*";
                break;
            case 2:
                nombreNum = "**";
                break;
            case 3:
                nombreNum = "***";
                break;
            case 4:
                nombreNum = "****";
                break;
            case 5:
                nombreNum = "*****";
                break;
            case 6:
                nombreNum = "******";
                break;
            case 7:
                nombreNum = "*******";
                break;
            case 8:
                nombreNum = "********";
                break;
            case 9:
                nombreNum = "*********";
                break;
            case 0:
                nombreNum = " ";
                break;
            case 10:
                nombreNum = "**********";
                break;

            default:
                nombreNum = "Número no válido. Debe estar entre 0 y 10.";
        }


        System.out.println(nombreNum);
    }
}