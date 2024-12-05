//Crear una función que, mediante un booleano, indique si el carácter que se pasa como parámetro de entrada corresponde con una vocal.

package U3;

public class Ejercicio6 {
    public static boolean esVocal(char caracter) {

        char c = Character.toLowerCase(caracter);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    public static void main(String[] args) {

        char caracter = 'a'; //Javi: Cambia aqui el caracter que quieras.

        if (esVocal(caracter)) {
            System.out.println("El carácter '" + caracter + "' es una vocal.");
        } else {
            System.out.println("El carácter '" + caracter + "' no es una vocal.");
        }
    }
}
