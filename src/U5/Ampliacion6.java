package U5;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Random;
public class Ampliacion6 {
    interface Cola {
        void encolar(int elemento);
        int desencolar();
        boolean estaVacia();
    }

    class ColaTabla implements Cola {
        private Integer[] tabla;
        private int primero;
        private int ultimo;
        private int tamaño;
        private int capacidad;

        public ColaTabla(int capacidad) {
            this.capacidad = capacidad;
            this.tabla = new Integer[capacidad];
            this.primero = 0;
            this.ultimo = -1;
            this.tamaño = 0;
        }

        @Override
        public boolean estaVacia() {
            return tamaño == 0;
        }

        public boolean estaLlena() {
            return tamaño == capacidad;
        }

        @Override
        public void encolar(int elemento) {
            if (estaLlena()) {
                throw new IllegalStateException("La cola está llena");
            }
            ultimo = (ultimo + 1) % capacidad;
            tabla[ultimo] = elemento;
            tamaño++;
        }

        @Override
        public int desencolar() {
            if (estaVacia()) {
                throw new NoSuchElementException("La cola está vacía");
            }
            int elemento = tabla[primero];
            tabla[primero] = null;
            primero = (primero + 1) % capacidad;
            tamaño--;
            return elemento;
        }
    }

    static class ColaLista implements Cola {
        private LinkedList<Integer> lista;

        public ColaLista() {
            this.lista = new LinkedList<>();
        }

        @Override
        public void encolar(int elemento) {
            lista.addLast(elemento);
        }

        @Override
        public int desencolar() {
            if (estaVacia()) {
                throw new NoSuchElementException("La cola está vacía");
            }
            return lista.removeFirst();
        }

        @Override
        public boolean estaVacia() {
            return lista.isEmpty();
        }
    }

    public class Main {
        public static void main(String[] args) {
            Cola cola = new ColaLista(); // Se puede cambiar por ColaTabla con una capacidad específica
            Random random = new Random();

            System.out.println("Encolando 10 números aleatorios:");
            for (int i = 0; i < 10; i++) {
                int num = random.nextInt(100) + 1;
                cola.encolar(num);
                System.out.println("Encolado: " + num);
            }

            System.out.println("\nDesencolando los números:");
            while (!cola.estaVacia()) {
                System.out.println("Desencolado: " + cola.desencolar());
            }
        }
    }
}
