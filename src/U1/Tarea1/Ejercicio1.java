package U1.Tarea1;


import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

                System.out.print("Vamos a mezclar dos números introducidos por");
                System.out.println("teclado en uno los pares y en otro los impares");
                System.out.print("----------------------------------------------");
                System.out.println("--------------------------------------------");

                System.out.print("Introduce un número: ");
                Scanner x = new Scanner(System.in);
                long numero = x.nextLong();

                System.out.print("Introduce otro número: ");
                long numeroDos = x.nextLong();

                long numeroPrincipio = numero;
                long vuelta = 0;
                long numeroIntroducidoDos = numeroDos;
                long vueltaDos = 0;


                while (numeroPrincipio > 0) {
                    vuelta = (vuelta * 10) + (numeroPrincipio % 10);
                    numeroPrincipio = numeroPrincipio / 10;
                }

                while (numeroIntroducidoDos > 0) {
                    vueltaDos = (vueltaDos * 10) + (numeroIntroducidoDos % 10);
                    numeroIntroducidoDos = numeroIntroducidoDos / 10;
                }

                long ultimaCifraUna = 0;
                long ultimaCifraDos = 0;
                long vueltaPar = vuelta;
                long vueltaParDos = vueltaDos;

                System.out.print("El número formado por las cifras pares es: ");
                do {
                    ultimaCifraUna = vueltaPar % 10;
                    ultimaCifraDos = vueltaParDos % 10;
                    if (ultimaCifraUna % 2 == 0) {
                        System.out.print(ultimaCifraUna);
                    }
                    if (ultimaCifraDos % 2 == 0) {
                        System.out.print(ultimaCifraDos);
                    }
                    vueltaPar = vueltaPar / 10;
                    vueltaParDos = vueltaParDos / 10;
                } while (vueltaPar > 0 || vueltaParDos > 0);

                System.out.println("");

                System.out.print("El número formado por las cifras impares es: ");
                do {
                    ultimaCifraUna = vuelta % 10;
                    ultimaCifraDos = vueltaDos % 10;
                    if (ultimaCifraUna % 2 != 0) {
                        System.out.print(ultimaCifraUna);
                    }
                    if (ultimaCifraDos % 2 != 0) {
                        System.out.print(ultimaCifraDos);
                    }
                    vuelta = vuelta / 10;
                    vueltaDos = vueltaDos / 10;
                } while (vuelta > 0 || vueltaDos > 0);

            }
        }