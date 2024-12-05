//Escribir una función que decida si dos números enteros positivos son amigos.
// Dos números son amigos si la suma de los divisores propios (distinto de él mismo) del primer número es igual al segundo número, y viceversa.
// Ejemplos: (220 - 284), (1184 - 1210)

package U3;

public class Ejercicio10 {
    public static int sumaDivisoresPropios(int num) {
        int suma = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static boolean sonAmigos(int num1, int num2) {

        return sumaDivisoresPropios(num1) == num2 && sumaDivisoresPropios(num2) == num1;
    }

    public static void main(String[] args) {

        int num1 = 220;
        int num2 = 284;

        if (sonAmigos(num1, num2)) {
            System.out.println(num1 + " y " + num2 + " son números amigos.");
        } else {
            System.out.println(num1 + " y " + num2 + " no son números amigos.");
        }

        int num3 = 1184;
        int num4 = 1210;

        if (sonAmigos(num3, num4)) {
            System.out.println(num3 + " y " + num4 + " son números amigos.");
        } else {
            System.out.println(num3 + " y " + num4 + " no son números amigos.");
        }
    }
}
