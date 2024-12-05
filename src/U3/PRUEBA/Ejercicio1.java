//Crea una función llamada palabraAhorcado que reciba como parámetros dos cadenas (la cadena a adivinar y el resultado parcial)
// y un carácter a buscar en la cadena a adivinar. Debe devolver el resultado de encontrar ese character en la cadena a adivinar.
//La función tendrá el siguiente prototipo:
//public static String palabraAhorcado(String cadena_a_adivinar, String resultado_parcial, char letra)
//En el programa principal, se debe pedir al usuario que introduzca una palabra a adivinar y un carácter a buscar en la cadena.
// Se pedirá caracteres hasta que se consiga adivinar la palabra completa.
//
//NOTA: La palabra a adivinar no contendrá tildes ni caracteres extraños, además será en minúsculas para simplificar el ejercicio.

package U3.PRUEBA;
import java.util.Scanner;
public class Ejercicio1 {
    public static String palabraAhorcado(String cadena_a_adivinar, String resultado_parcial, char letra) {

        char[] adivinarArray = cadena_a_adivinar.toCharArray();


        char[] resultadoArray = resultado_parcial.toCharArray();


        for (int i = 0; i < adivinarArray.length; i++) {

            if (adivinarArray[i] == letra) {
                resultadoArray[i] = letra;
            }
        }

        return new String(resultadoArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la palabra a adivinar: ");
        String palabraAdivinar = scanner.nextLine();

        String resultadoParcial = "_".repeat(palabraAdivinar.length());

        while (!resultadoParcial.equals(palabraAdivinar)) {
            System.out.print("Introduce una letra: ");
            char letra = scanner.nextLine().charAt(0);

            resultadoParcial = palabraAhorcado(palabraAdivinar, resultadoParcial, letra);

            System.out.println("Resultado parcial: " + resultadoParcial);
        }

        System.out.println(" Palabra adivinada: " + palabraAdivinar);
    }
}
