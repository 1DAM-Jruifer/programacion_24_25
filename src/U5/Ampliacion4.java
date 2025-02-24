package U5;
import java.util.LinkedList;
public class Ampliacion4 {
    public class Conjunto {
        private LinkedList<Integer> lista;
        private int capacidad;

        public Conjunto() {
            this.capacidad = 10;
            this.lista = new LinkedList<>();
        }

        public Conjunto(int capacidad) {
            this.capacidad = capacidad;
            this.lista = new LinkedList<>();
        }

        public int tamaño() {
            return lista.size();
        }

        public void insertar(int elemento) {
            if (!lista.contains(elemento)) {
                lista.add(elemento);
            }
        }

        public void añadirConjunto(Conjunto otro) {
            for (int elemento : otro.lista) {
                insertar(elemento);
            }
        }

        public void eliminar(int elemento) {
            lista.remove(Integer.valueOf(elemento));
        }

        public void eliminarConjunto(Conjunto otro) {
            lista.removeAll(otro.lista);
        }

        public boolean pertenece(int elemento) {
            return lista.contains(elemento);
        }

        @Override
        public String toString() {
            return "Conjunto: " + lista.toString();
        }

        public void main(String[] args) {
            Conjunto conjunto = new Conjunto();
            conjunto.insertar(5);
            conjunto.insertar(10);
            conjunto.insertar(15);
            System.out.println(conjunto);

            Conjunto otroConjunto = new Conjunto();
            otroConjunto.insertar(10);
            otroConjunto.insertar(20);

            conjunto.añadirConjunto(otroConjunto);
            System.out.println(conjunto);

            conjunto.eliminar(5);
            System.out.println(conjunto);

            conjunto.eliminarConjunto(otroConjunto);
            System.out.println(conjunto);
        }
    }
}
