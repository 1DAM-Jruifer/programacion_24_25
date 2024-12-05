//Desarrollar una función que se denomine insertarEnVector con el siguiente prototipo:
//
//public static int[] insertarEnVector(int[] v1, int [] v2, int pos)

//Recibirá como parámetros dos vectores de enteros y una posición. Devolverá un vector de enteros que contenga
// el primer array con el segundo array insertado de manera completa a partir de la posición dada. Si la posición es menor que 0,
// el vector devuelto deberá contener el primer array. Si la posición es mayor que la longitud del primer array,
// el vector devuelto deberá contener el segundo array. Si la posición es igual a la longitud del primer array, el vector
// devuelto deberá contener el primer array con el segundo array insertado al final. Probar dicha función en el método Main.

package U3.PRUEBA;

public class Ejercicio2 {
    public static int[] insertarEnVector(int[] v1, int[] v2, int pos) {

        if (pos < 0) {
            return v1;
        }

        if (pos > v1.length) {
            return v2;
        }

        if (pos == v1.length) {
            int[] resultado = new int[v1.length + v2.length];
            System.arraycopy(v1, 0, resultado, 0, v1.length);
            System.arraycopy(v2, 0, resultado, v1.length, v2.length);
            return resultado;
        }

        int[] resultado = new int[v1.length + v2.length];
        System.arraycopy(v1, 0, resultado, 0, pos);
        System.arraycopy(v2, 0, resultado, pos, v2.length);
        System.arraycopy(v1, pos, resultado, pos + v2.length, v1.length - pos);
        return resultado;
    }

    public static void main(String[] args) {

        int[] v1 = {1, 2, 3, 4, 5};
        int[] v2 = {6, 7, 8};

        int[] resultado1 = insertarEnVector(v1, v2, -1);
        System.out.println("Resultado 1: " + java.util.Arrays.toString(resultado1));

        int[] resultado2 = insertarEnVector(v1, v2, 10);
        System.out.println("Resultado 2: " + java.util.Arrays.toString(resultado2));

        int[] resultado3 = insertarEnVector(v1, v2, 5);
        System.out.println("Resultado 3: " + java.util.Arrays.toString(resultado3));

        int[] resultado4 = insertarEnVector(v1, v2, 2);
        System.out.println("Resultado 4: " + java.util.Arrays.toString(resultado4));
    }

}
