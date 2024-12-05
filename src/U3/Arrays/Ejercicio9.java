//Definir una función que tome como parámetros dos tablas, la primera con 6 números de una apuesta de la primitiva,
// y la segunda con los 6 números de la combinación ganadora. La función devolverá el número de aciertos.

package U3.Arrays;

public class Ejercicio9 {
    public static int contarAciertos(int[] apuesta, int[] ganadora) {
        int aciertos = 0;

        for (int i = 0; i < apuesta.length; i++) {

            for (int j = 0; j < ganadora.length; j++) {
                if (apuesta[i] == ganadora[j]) {
                    aciertos++;
                    break;
                }
            }
        }
        return aciertos;
    }

    public static void main(String[] args) {

        int[] apuesta = {1, 2, 5, 7, 9, 11};
        int[] ganadora = {1, 2, 5, 7, 9, 11};

        int aciertos = contarAciertos(apuesta, ganadora);
        System.out.println("Número de aciertos: " + aciertos);
    }
}
