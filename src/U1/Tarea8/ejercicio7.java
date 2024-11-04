//Diseñar un programa que muestre el producto de los 10 primeros números impares.

package U1.Tarea8;

public class ejercicio7 {
    public static void main(String[] args) {
        long producto = 1;

        for (int i = 1, contador = 0; contador < 10; i += 2, contador++) {
            producto *= i;
        }

        System.out.println("El producto de los 10 primeros números impares es: " + producto);
    }

}
