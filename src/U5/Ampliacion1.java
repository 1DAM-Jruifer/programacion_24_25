package U5;
import java.util.*;
public class Ampliacion1 {
    class Cliente implements Comparable<Cliente> {
        private String dni;
        private String nombre;
        private int edad;
        private double saldo;

        public Cliente(String dni, String nombre, int edad, double saldo) {
            this.dni = dni;
            this.nombre = nombre;
            this.edad = edad;
            this.saldo = saldo;
        }

        public String getDni() {
            return dni;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        @Override
        public String toString() {
            return "Cliente{dni='" + dni + "', nombre='" + nombre + "', edad=" + edad + ", saldo=" + saldo + "}";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Cliente cliente = (Cliente) obj;
            return dni.equals(cliente.dni);
        }

        @Override
        public int compareTo(Cliente otro) {
            return this.dni.compareTo(otro.dni);
        }

        public static Comparator<Cliente> compararPorNombre = Comparator.comparing(Cliente::getNombre);
        public static Comparator<Cliente> compararPorEdad = Comparator.comparingInt(Cliente::getEdad);
    }

    public class Main {
        public void main(String[] args) {
            List<Integer> numeros = new ArrayList<>();
            Random random = new Random();

            for (int i = 0; i < 20; i++) {
                numeros.add(random.nextInt(100) + 1);
            }

            System.out.println("Números aleatorios:");
            System.out.println(numeros);

            numeros.sort(Comparator.reverseOrder());

            System.out.println("\nNúmeros ordenados en orden decreciente:");
            System.out.println(numeros);

            List<Cliente> clientes = new ArrayList<>();
            clientes.add(new Cliente("12345678A", "Carlos", 30, 1500.0));
            clientes.add(new Cliente("87654321B", "Ana", 25, 2000.0));
            clientes.add(new Cliente("56781234C", "Luis", 35, 1800.0));
            clientes.add(new Cliente("43218765D", "Maria", 28, 2500.0));
            clientes.add(new Cliente("34567812E", "Pedro", 40, 1200.0));

            System.out.println("\nOrdenados por DNI:");
            Collections.sort(clientes);
            clientes.forEach(System.out::println);

            System.out.println("\nOrdenados por Nombre:");
            clientes.sort(Cliente.compararPorNombre);
            clientes.forEach(System.out::println);

            System.out.println("\nOrdenados por Edad:");
            clientes.sort(Cliente.compararPorEdad);
            clientes.forEach(System.out::println);
        }
    }
}
