package U5;
import java.util.LinkedList;
import java.util.NoSuchElementException;
public class Ampliacion3 {
    public class ColaTabla {
        private LinkedList<Integer> lista;

        public ColaTabla() {
            this.lista = new LinkedList<>();
        }

        public boolean estaVacia() {
            return lista.isEmpty();
        }

        public void encolar(int elemento) {
            lista.addLast(elemento);
        }

        public int desencolar() {
            if (estaVacia()) {
                throw new NoSuchElementException("La cola está vacía");
            }
            return lista.removeFirst();
        }

        public int frente() {
            if (estaVacia()) {
                throw new NoSuchElementException("La cola está vacía");
            }
            return lista.getFirst();
        }

        public int tamaño() {
            return lista.size();
        }

        public void main(String[] args) {
            ColaTabla cola = new ColaTabla();
            cola.encolar(10);
            cola.encolar(20);
            cola.encolar(30);
            System.out.println("Frente de la cola: " + cola.frente());
            System.out.println("Desencolando: " + cola.desencolar());
            System.out.println("Frente de la cola: " + cola.frente());
        }
    }
}
