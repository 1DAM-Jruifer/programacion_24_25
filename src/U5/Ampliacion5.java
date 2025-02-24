package U5;
import java.util.LinkedList;
public class Ampliacion5 {
    public static class Conjunto {
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

        public static boolean incluido(Conjunto c1, Conjunto c2) {
            return c1.lista.stream().allMatch(c2.lista::contains);
        }

        public static Conjunto union(Conjunto c1, Conjunto c2) {
            Conjunto resultado = new Conjunto();
            resultado.añadirConjunto(c1);
            resultado.añadirConjunto(c2);
            return resultado;
        }

        public static Conjunto interseccion(Conjunto c1, Conjunto c2) {
            Conjunto resultado = new Conjunto();
            for (int elemento : c1.lista) {
                if (c2.pertenece(elemento)) {
                    resultado.insertar(elemento);
                }
            }
            return resultado;
        }

        public static Conjunto diferencia(Conjunto c1, Conjunto c2) {
            Conjunto resultado = new Conjunto();
            for (int elemento : c1.lista) {
                if (!c2.pertenece(elemento)) {
                    resultado.insertar(elemento);
                }
            }
            return resultado;
        }

        @Override
        public String toString() {
            return "Conjunto: " + lista.toString();
        }

        public static void main(String[] args) {
            Conjunto conjunto1 = new Conjunto();
            conjunto1.insertar(1);
            conjunto1.insertar(2);
            conjunto1.insertar(3);

            Conjunto conjunto2 = new Conjunto();
            conjunto2.insertar(2);
            conjunto2.insertar(3);
            conjunto2.insertar(4);

            System.out.println("Unión: " + Conjunto.union(conjunto1, conjunto2));
            System.out.println("Intersección: " + Conjunto.interseccion(conjunto1, conjunto2));
            System.out.println("Diferencia: " + Conjunto.diferencia(conjunto1, conjunto2));
            System.out.println("¿Incluido?: " + Conjunto.incluido(conjunto1, conjunto2));
        }
    }
}
