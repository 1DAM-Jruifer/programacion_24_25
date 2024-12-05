//Un restaurante nos ha encargado una aplicación para colocar a los clientes en sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales(mesa llena).
//Cuando llega un cliente se le pregunta cuántos son. De momento el programa no está preparado para colocar a grupos mayores a 4,
// por tanto, si un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje "Lo siento, no admitimos grupos de 6,
// haga grupos de 4 personas como máximo e intente de nuevo". Para el grupo que llega, se busca siempre la primera mesa libre (con 0 personas).
//Si no quedan mesas libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de dos
// personas, se podrá colocar donde haya una o dos personas. Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4.
//Cada vez que se sientan nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se pueden romper aunque haya huecos sueltos suficientes.

package U3.Arrays2;

import java.util.Random;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        int[] mesas = new int[10];
        Random rand = new Random();

        for (int i = 0; i < mesas.length; i++) {
            mesas[i] = rand.nextInt(5);
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Estado actual de las mesas:");
            mostrarMesas(mesas);

            System.out.print("¿Cuántos son? (Máximo 4 personas, o -1 para salir): ");
            int grupo = scanner.nextInt();

            if (grupo == -1) {
                System.out.println("¡Gracias por su visita!");
                break;
            }

            if (!asignarMesa(mesas, grupo)) {
                System.out.println("Lo siento, no hay espacio para " + grupo + " personas.");
            }
        }
    }

    public static void mostrarMesas(int[] mesas) {
        for (int i = 0; i < mesas.length; i++) {
            System.out.print("Mesa " + (i + 1) + ": " + mesas[i] + " ocupados, ");
        }
        System.out.println();
    }

    public static boolean asignarMesa(int[] mesas, int grupo) {

        for (int i = 0; i < mesas.length; i++) {
            if (mesas[i] == 0) {

                mesas[i] = grupo;
                System.out.println("Grupo de " + grupo + " personas se ha sentado en la Mesa " + (i + 1));
                return true;
            }
        }

        for (int i = 0; i < mesas.length; i++) {
            if (mesas[i] + grupo <= 4) {

                mesas[i] += grupo;
                System.out.println("Grupo de " + grupo + " personas se ha sentado en la Mesa " + (i + 1));
                return true;
            }
        }

        return false;
    }
}
