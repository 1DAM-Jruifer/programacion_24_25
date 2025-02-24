package U5;
//EJERCICIO DEL 5 AL 6 DE HERENCIA
public class Ejercicio5 {

    enum Nota {
        DO, RE, MI, FA, SOL, LA, SI;

        abstract class Instrumento {
            protected static final int MAX_NOTAS = 100;
            protected Nota[] notas = new Nota[MAX_NOTAS];
            protected int numNotas = 0;

            public void add(Nota nota) {
                if (numNotas < MAX_NOTAS) {
                    notas[numNotas++] = nota;
                }
            }

            public abstract void interpretar();
        }

        // Clase Piano
        class Piano extends Instrumento {
            @Override
            public void interpretar() {
                System.out.print("Piano interpreta: ");
                for (int i = 0; i < numNotas; i++) {
                    System.out.print(notas[i] + " ");
                }
                System.out.println();
            }
        }

        // Clase Campana
        class Campana extends Instrumento {
            @Override
            public void interpretar() {
                System.out.print("Campana interpreta: ");
                for (int i = 0; i < numNotas; i++) {
                    System.out.print(notas[i] + " ");
                }
                System.out.println();
            }

        }
    }
}
