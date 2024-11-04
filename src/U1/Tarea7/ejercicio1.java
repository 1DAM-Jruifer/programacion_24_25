//Realiza un programa que dadas dos variables a y b, intercambie los valores de a y b.

package U1.Tarea7;

public class ejercicio1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Antes del intercambio: a = " + a + ", b = " + b);


        int temp = a;
        a = b;
        b = temp;

        System.out.println("Después del intercambio: a = " + a + ", b = " + b);
    }
}
