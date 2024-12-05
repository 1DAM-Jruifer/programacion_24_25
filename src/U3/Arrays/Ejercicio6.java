//Implementar una función sinRepetidos() con el prototipo:
//int[] sinRepetidos(int t[])
//que construye y devuelve una tabla del tamaño apropiado, con los elementos de t, donde se han eliminado los datos repetidos.

package U3.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {

        int[] t = {1, 2, 2, 3, 4, 4, 5};

        int[] resultado = sinRepetidos(t);

        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }

    public static int[] sinRepetidos(int[] t) {

        int n = t.length;
        int contador = 0;

        for (int i = 0; i < n; i++) {
            boolean esRepetido = false;

            for (int j = 0; j < i; j++) {
                if (t[i] == t[j]) {
                    esRepetido = true;
                    break;
                }
            }

            if (!esRepetido) {
                contador++;
            }
        }

        int[] resultado = new int[contador];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean esRepetido = false;

            for (int j = 0; j < i; j++) {
                if (t[i] == t[j]) {
                    esRepetido = true;
                    break;
                }
            }

            if (!esRepetido) {
                resultado[index++] = t[i];
            }
        }

        return resultado;
    }
}
