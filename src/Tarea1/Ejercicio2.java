package Tarea1;


import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        {
             {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Introduce un número entero: ");
                long numero = scanner.nextLong();


                String numeroStr = Long.toString(Math.abs(numero));

                StringBuilder digitosPares = new StringBuilder();
                StringBuilder digitosImpares = new StringBuilder();
                long sumaPares = 0;
                long sumaImpares = 0;


                for (char digito : numeroStr.toCharArray()) {
                    int d = Character.getNumericValue(digito);
                    if (d % 2 == 0) {
                        digitosPares.append(digito).append(" ");
                        sumaPares += d;
                    } else {
                        digitosImpares.append(digito).append(" ");
                        sumaImpares += d;
                    }
                }


                System.out.println("Dígitos pares: " + digitosPares.toString().trim());
                System.out.println("Suma de dígitos pares: " + sumaPares);
                System.out.println("Dígitos impares: " + digitosImpares.toString().trim());
                System.out.println("Suma de dígitos impares: " + sumaImpares);

                scanner.close();
            }
        }
    }
}

