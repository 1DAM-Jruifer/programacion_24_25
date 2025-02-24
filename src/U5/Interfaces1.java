package U5;
import java.util.Scanner;
import java.util.LinkedList;

public class Interfaces1 {

    interface Pila {
        void apilar(int elemento);

        int desapilar();

        boolean estaVacia();
    }

    class PilaTabla implements Pila {
        private int[] elementos;
        private int tope;
        private static final int CAPACIDAD = 10;

        public PilaTabla() {
            elementos = new int[CAPACIDAD];
            tope = -1;
        }

        @Override
        public void apilar(int elemento) {
            if (tope < CAPACIDAD - 1) {
                elementos[++tope] = elemento;
            } else {
                System.out.println("La pila está llena");
            }
        }

        @Override
        public int desapilar() {
            if (!estaVacia()) {
                return elementos[tope--];
            }
            throw new IllegalStateException("La pila está vacía");
        }

        @Override
        public boolean estaVacia() {
            return tope == -1;
        }
    }

    class PilaLista implements Pila {
        private LinkedList<Integer> elementos;

        public PilaLista() {
            elementos = new LinkedList<>();
        }

        @Override
        public void apilar(int elemento) {
            elementos.push(elemento);
        }

        @Override
        public int desapilar() {
            if (!estaVacia()) {
                return elementos.pop();
            }
            throw new IllegalStateException("La pila está vacía");
        }

        @Override
        public boolean estaVacia() {
            return elementos.isEmpty();
        }
    }

    public class Main {
        public void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Pila pila = new PilaLista();

            System.out.println("Introduce 10 números:");
            for (int i = 0; i < 10; i++) {
                pila.apilar(scanner.nextInt());
            }

            System.out.println("Números en orden inverso:");
            while (!pila.estaVacia()) {
                System.out.println(pila.desapilar());
            }

            scanner.close();
        }
    }
}
