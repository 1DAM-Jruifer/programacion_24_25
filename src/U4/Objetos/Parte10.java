//Escribir un programa que lea por teclado una hora cualquiera y un número n
// que representa una cantidad de segundos. El programa mostrará la hora introducida
// y la hora resultante de sumar a esa hora, la cantidad de segundos indicada.
// Para ello hemos de diseñar previamente la clase Hora que dispone de los atributos
// hora, minuto y segundo. Los valores de los atributos se controlarán mediante métodos set/get.

package U4.Objetos;
import java.util.Scanner;

public class Parte10 {

    public class Hora {
        private int hora;
        private int minuto;
        private int segundo;

        public Hora(int hora, int minuto, int segundo) {
            setHora(hora);
            setMinuto(minuto);
            setSegundo(segundo);
        }

        public int getHora() {
            return hora;
        }

        public void setHora(int hora) {
            if (hora >= 0 && hora < 24) {
                this.hora = hora;
            } else {
                throw new IllegalArgumentException("La hora debe estar entre 0 y 23.");
            }
        }

        public int getMinuto() {
            return minuto;
        }

        public void setMinuto(int minuto) {
            if (minuto >= 0 && minuto < 60) {
                this.minuto = minuto;
            } else {
                throw new IllegalArgumentException("El minuto debe estar entre 0 y 59.");
            }
        }

        public int getSegundo() {
            return segundo;
        }

        public void setSegundo(int segundo) {
            if (segundo >= 0 && segundo < 60) {
                this.segundo = segundo;
            } else {
                throw new IllegalArgumentException("El segundo debe estar entre 0 y 59.");
            }
        }

        public void sumarSegundos(int segundosASumar) {
            int totalSegundos = this.hora * 3600 + this.minuto * 60 + this.segundo + segundosASumar;

            totalSegundos %= 86400; // Reducir a un día (86400 segundos)

            this.hora = totalSegundos / 3600;
            totalSegundos %= 3600;

            this.minuto = totalSegundos / 60;
            this.segundo = totalSegundos % 60;
        }

        @Override
        public String toString() {
            return String.format("%02d:%02d:%02d", hora, minuto, segundo);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Introduce la hora (0-23): ");
                int hora = scanner.nextInt();

                System.out.print("Introduce los minutos (0-59): ");
                int minuto = scanner.nextInt();

                System.out.print("Introduce los segundos (0-59): ");
                int segundo = scanner.nextInt();



                System.out.print("Introduce la cantidad de segundos a sumar: ");
                int segundosASumar = scanner.nextInt();



            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }
}
