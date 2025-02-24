package U5;
import java.util.NoSuchElementException;
public class Ampliacion2 {
    public class ColaTabla {
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

        public boolean estaVacia() {
            return tamaño == 0;
        }

        public boolean estaLlena() {
            return tamaño == capacidad;
        }

        public void encolar(int elemento) {
            if (estaLlena()) {
                throw new IllegalStateException("La cola está llena");
            }
            ultimo = (ultimo + 1) % capacidad;
            tabla[ultimo] = elemento;
            tamaño++;
        }

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

        public int frente() {
            if (estaVacia()) {
                throw new NoSuchElementException("La cola está vacía");
            }
            return tabla[primero];
        }

        public int tamaño() {
            return tamaño;
        }

        public void main(String[] args) {
            ColaTabla cola = new ColaTabla(5);
            cola.encolar(10);
            cola.encolar(20);
            cola.encolar(30);
            System.out.println("Frente de la cola: " + cola.frente());
            System.out.println("Desencolando: " + cola.desencolar());
            System.out.println("Frente de la cola: " + cola.frente());
        }
    }

}
