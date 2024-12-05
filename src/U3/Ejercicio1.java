//Actividad 1: Diseñar una función eco() a la que se le pasa como parámetro un número n, y muestra por pantalla n veces el mensaje "Eco..."

package U3;
public class Ejercicio1 {
    public static void main(String[] args) {
            int n = 7;
            eco(n);
        }
        public static void eco(int n) {
            for (int i = 0; i < n; i++) {
                System.out.println("Eco");
            }
        }
    }