//Crear una función matrizLetras que:
//
//Reciba una cadena de caracteres
//Devuelve una matriz donde se ha dividido esa frase en filas que tengan 5 columnas. No serán tenidos en cuenta los espacios

package U3.EXAMEN;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String letra = (" ");
        while (true){
            System.out.println("Escribe una letra para ir formando una frase de forma deletreada: ");
            String p = teclado.nextLine();
            if (p.equals("fin")){
                break;
            }
            letra = letra + (" ") + p;
        }
        System.out.println(letra);

        //Deberás de escribir la palabra fin para acabar la frase deletrada.

        int columnas = 5;
        int[] matriz = new int[columnas];

        String frases = ("Hola que tal estas hoy martes?");

        int contador = 0;

        for (int i = 0; contador < frases.length(); i++) {

        }
    }
}
