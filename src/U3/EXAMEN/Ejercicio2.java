//Crear dos funciones que para que trabajen con arrays de una solo dimensión de enteros:

//La primera función duplicados:
//Recibe un vector de enteros
//Devuelve true si dentro hay algún elemento repetido o false en caso contrario.

//La segunda función elimina duplicados:
//
//Recibe un vector de enteros.
//Devuelve dicho vector sin los elementos que están repetidos.

package U3.EXAMEN;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Sin repetidos:");

        //Aquí cambiaremos el vector en cuestión //

        //------------------------------------------//

        int[] t = {1, 2, 2, 3, 4, 4, 5, 5, 5, 5};

        //------------------------------------------//

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
