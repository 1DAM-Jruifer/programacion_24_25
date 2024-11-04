package Examen;

import java.util.Scanner;

public class Examen3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 4: ");
        int numero = scanner.nextInt();
        String numerotexto = "";
        switch (numero){
            case 1: numerotexto = "picas";break;
            case 2: numerotexto = "diamantes";break;
            case 3: numerotexto = "corazones";break;
            case 4: numerotexto = "treboles";break;
        }


        System.out.println("Palo: " + numerotexto);

        int codigoASCII = (int) (Math.random() * (122 - 108));
        int numeroaleatorio = (int) codigoASCII;
        System.out.println("Carta: " + numeroaleatorio);

        //1,11,12,13 =A, J, Q, K Respectivamente




    }
}