//Realiza un programa que genere una letra minúscula de forma aleatoria. Investiga el uso de la función Math.random().
// Investiga también sobre el sistema de codificación ASCII y ten en cuenta que las letras minúsculas se corresponden con los números del 97 al 122.

package U1.Tarea7;

public class ejercicio3 {
    public static void main(String[] args) {

        int codigoASCII = (int) (Math.random() * (122 - 97 + 1)) + 97;


        char letraAleatoria = (char) codigoASCII;


        System.out.println("Letra minúscula aleatoria: " + letraAleatoria);
    }

}
