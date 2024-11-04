//Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.

package U1.Tarea8;

public class ejercicio11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

}
