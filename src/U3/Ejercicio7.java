//Diseñar una función que nos diga si un número es primo.

package U3;

public class Ejercicio7 {
    public static boolean esPrimo(int numero) {
        // Los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }

        // Solo necesitamos verificar hasta la raíz cuadrada del número
        // Si un número tiene un divisor mayor que su raíz cuadrada, también tendrá uno menor
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si es divisible por 'i', no es primo
            }
        }
        return true; // Si no tiene divisores, es primo
    }

    public static void main(String[] args) {
        // Test
        int numero = 29; //Javi: Cambia aqui el caracter que quieras.

        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }
    }
}

