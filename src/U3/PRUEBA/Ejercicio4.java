//Desarrollar una función que se denomine insertarFilaEnMatriz. Dicha función tendrá el siguiente prototipo:
//public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos)
//
//Recibirá como parámetro un vector bidimensional de Strings, un array unidimensional de Strings y una posición.
// Devolverá como resultado un array bidimensional en el que esté insertado como una nueva fila en la matriz el array en la posición que se indica.
//Se deberá imprimir la matriz antes y después de insertar la fila.
//
//NOTA: Las filas de la matriz deben tener el mismo número de elementos. No es necesario comprobarlo,
//como tampoco es necesario comprobar que la posición pasada es válida, se entenderá que el usuario pasa una posición válida.

package U3.PRUEBA;

public class Ejercicio4 {
    public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos) {

        String[][] nuevaMatriz = new String[matriz.length + 1][matriz[0].length];

        for (int i = 0; i < pos; i++) {
            nuevaMatriz[i] = matriz[i];
        }

        nuevaMatriz[pos] = fila;

        for (int i = pos; i < matriz.length; i++) {
            nuevaMatriz[i + 1] = matriz[i];
        }

        return nuevaMatriz;
    }

    public static void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        String[][] matriz = {
                {"A1", "B1", "C1"},
                {"A2", "B2", "C2"},
                {"A3", "B3", "C3"}
        };

        String[] fila = {"D1", "D2", "D3"};

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        matriz = insertarFilaEnMatriz(matriz, fila, 1);

        System.out.println("Matriz después de insertar la fila:");
        imprimirMatriz(matriz);
    }
}
