//Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando las palabras introducidas con espacios en blanco.
// Terminar de leer la frase cuando la palabra introducida sea "fin" escrita con cualquier combinación de mayúsculas/minúsculas.
// La cadena "fin" no aparecerá en la frase final.

package U3.Cadenas;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String frase = (" ");
        while (true){
            System.out.println("Escribe una frase: ");
            String p = teclado.nextLine();
            if (p.equals("fin")){
                break;
            }
            frase = frase + (" ") + p;
        }
        System.out.println(frase);
    }
}